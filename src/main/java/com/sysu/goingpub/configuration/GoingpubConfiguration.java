package com.sysu.goingpub.configuration;

import com.sysu.goingpub.interceptor.LoginRequiredInterceptor;
import com.sysu.goingpub.interceptor.TicketInterceptor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurationSupport;

public class GoingpubConfiguration extends WebMvcConfigurationSupport {

    @Autowired
    LoginRequiredInterceptor loginRequiredInterceptor;

    @Autowired
    TicketInterceptor ticketInterceptor;

    @Override
    protected void addInterceptors(InterceptorRegistry registry) {
        registry.addInterceptor(ticketInterceptor);
        registry.addInterceptor(loginRequiredInterceptor).addPathPatterns("/jounrals/*");
        super.addInterceptors(registry);
    }
}
