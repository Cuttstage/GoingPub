package com.sysu.goingpub;

import com.alibaba.fastjson.JSON;
import com.sysu.goingpub.dto.request.LoginUserRequest;
import com.sysu.goingpub.dto.request.QueryJournalListRequest;
import com.sysu.goingpub.dto.request.RegisterUserRequest;
import com.sysu.goingpub.dto.response.BaseResponse;
import com.sysu.goingpub.dto.response.PageDTO;
import com.sysu.goingpub.model.Journal;
import com.sysu.goingpub.model.JournalInfo;
import com.sysu.goingpub.service.article.JournalService;
import com.sysu.goingpub.service.login.UserService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.util.StringUtils;

import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletRequestWrapper;

@RunWith(SpringRunner.class)
@SpringBootTest
public class goingpub {

    @Autowired
    UserService userService;

    @Autowired
    JournalService journalService;

    @Test
    public void test1(){
        RegisterUserRequest request = new RegisterUserRequest();
        request.setEmail("1051801433@qq.com");
        request.setPassword("123456");
        request.setRealName("林学贤");
        request.setNickName("leonardolin");
        request.setProvince("广东");
        request.setCompanyType("大学");
        request.setCompanyName("中山大学");
        request.setOtherImformation("无");
        request.setDepartment("");
        request.setAddress("地址");
        request.setAddressNumber(10000);
        request.setPhone(Long.parseLong("18142811886"));
        request.setNeed("可能需要");
//        BaseResponse<String> baseResponse = new BaseResponse<>();
        System.out.println(userService);
        String ticket = userService.register(request);
        System.out.println(ticket);
    }

    @Test
    public void test2(){
        LoginUserRequest loginUserRequest = new LoginUserRequest();
        loginUserRequest.setEmail("1051801433@qq.com");
        loginUserRequest.setPassword("123456");
        String ticket = userService.login(loginUserRequest);
        System.out.println(ticket);
    }

    @Test
    public void test3() {
        QueryJournalListRequest request = new QueryJournalListRequest();
        request.setPageNo(3);
        request.setPageSize(2);
        PageDTO<JournalInfo> pageDTO = journalService.getJournal(request);
        System.out.println(JSON.toJSONString(pageDTO));
    }

    @Test
    public void test4() {
        String ISSN = "2053-1583";
        JournalInfo journalInfo = journalService.getSingleJournal(ISSN);
        System.out.println(JSON.toJSONString(journalInfo));
    }

}
