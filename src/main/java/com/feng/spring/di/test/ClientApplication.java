package com.feng.spring.di.test;

import com.feng.spring.di.configuration.DIConfiguration;
import com.feng.spring.di.consumer.MyApplication;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class ClientApplication {
        public static void main(String[] args) {
            AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(DIConfiguration.class);
            MyApplication app = context.getBean(MyApplication.class);

            app.processMessage("Hi Pankaj", "pankaj@abc.com");

            // 关闭上下文
            context.close();
        }
}
