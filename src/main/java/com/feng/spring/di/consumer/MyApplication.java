package com.feng.spring.di.consumer;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.stereotype.Component;

import com.feng.spring.di.services.MessageService;

@Component
public class MyApplication {

    // 基于变量的依赖注入
    //@Autowired
    private MessageService service;

    //	基于构造参数的 dependency injection
    //	@Autowired
    //	public MyApplication(MessageService svc){
    //		this.service=svc;
    //	}

    @Autowired
    public void setService(MessageService svc){
        this.service=svc;
    }

    public boolean processMessage(String msg, String rec){
        //验证，日志等信息
        return this.service.sendMessage(msg, rec);
    }
}
