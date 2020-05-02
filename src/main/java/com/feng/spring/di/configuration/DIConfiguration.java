package com.feng.spring.di.configuration;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

import com.feng.spring.di.services.EmailService;
import com.feng.spring.di.services.MessageService;

@Configuration
@ComponentScan(value={"com.feng.spring.di.consumer"})
public class DIConfiguration {

    @Bean
    public MessageService getMessageService(){
        return new EmailService();
    }
}