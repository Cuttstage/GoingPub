package com.sysu.goingpub.filter;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.serializer.SerializerFeature;
import com.sysu.goingpub.dto.request.BaseRequest;
import com.sysu.goingpub.dto.response.BaseResponse;
import com.sysu.goingpub.exception.BusinessException;
import com.sysu.goingpub.exception.enums.code.BaseExceptionCode;
import com.sysu.goingpub.utils.DateUtil;
import lombok.extern.slf4j.Slf4j;
import org.apache.commons.lang3.StringUtils;
import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.*;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.context.request.RequestContextHolder;
import org.springframework.web.context.request.ServletRequestAttributes;

import javax.servlet.http.HttpServletRequest;
import java.util.Date;

@Aspect
@Configuration
@Slf4j
public class GlobalExceptionFilter {

    @Pointcut("execution(public * com.sysu.goingpub.controller.*.*(..))")
    public void exception(){}

    @Before("exception()")
    public void deBefore(JoinPoint joinPoint) throws Throwable {

    }

    @AfterReturning(returning = "ret", pointcut = "exception()")
    public void doAfterReturning(Object ret) throws Throwable {
    }

    //后置异常通知
    @AfterThrowing("exception()")
    public void throwss(JoinPoint jp){
    }

    //后置最终通知,final增强，不管是抛出异常或者正常退出都会执行
    @After("exception()")
    public void after(JoinPoint jp){
    }


    @Around("exception()")
    public Object arround(ProceedingJoinPoint pjp) {
        long startTime = System.currentTimeMillis();
        StringBuffer requestLog = new StringBuffer();
        BaseResponse<?> result;
        try {
            ServletRequestAttributes attributes = (ServletRequestAttributes) RequestContextHolder.getRequestAttributes();
            HttpServletRequest request = attributes.getRequest();
            String callIp = request.getRemoteAddr();
            String className = pjp.getTarget().getClass().getSimpleName();
            String methodName = pjp.getSignature().getName();
            requestLog.append(DateUtil.formatDateToString(new Date(),DateUtil.MILLISECOND_PATTERN));
            requestLog.append(" http调用方IP：").append(callIp);
            requestLog.append(",服务被调用,类：").append(className).append(",方法：").append(methodName).append(";请求数据:[");
            requestLog.append(JSON.toJSONString(pjp.getArgs(), SerializerFeature.IgnoreErrorGetter));
            Object[] objArr = pjp.getArgs();
            for (Object obj : objArr) {
                if (obj instanceof BaseRequest) {
                    BaseRequest baseRequest = (BaseRequest) obj;
                    String resultCheck = baseRequest.check();
                    if (StringUtils.isNotBlank(resultCheck)) {
                        throw new BusinessException(BaseExceptionCode.PARAM_ERROR.code, BaseExceptionCode.PARAM_ERROR.msg, resultCheck);
                    }
                }
            }
            result = (BaseResponse<?>) pjp.proceed();
        } catch (Throwable e) {
            result = handlerException(e);
        }
        requestLog.append("],响应数据：[").append(JSON.toJSONString(result)).append("],use time:").append((System.currentTimeMillis() - startTime));
        log.info(requestLog.toString());
        return result;
    }

	private BaseResponse<?> handlerException(Throwable e) {
        BaseResponse<?> response = new BaseResponse<>();
        // 已知异常
        if (e instanceof BusinessException) {
            BusinessException businessException = (BusinessException)e;
            String msg = businessException.getMessage();
            response.setCode(businessException.getCode());
            response.setMsg(msg);
            log.info("business error",e);
        } else {
            response.setCode(BaseExceptionCode.ERROR.code);
            response.setMsg(BaseExceptionCode.ERROR.msg);
            log.error("system error:",e);
        }
        return response;
    }
}