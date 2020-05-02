package com.feng.spring.di.services;

public class SmsService implements MessageService {

    public boolean sendMessage(String msg, String rec) {
        System.out.println("Sms message Sent to "+rec+ " with Message="+msg);
        return true;
    }
}
