package com.feng.spring.di;

import com.feng.spring.di.consumer.MyApplication;
import com.feng.spring.di.services.EmailService;
import com.feng.spring.di.services.MessageService;
import org.springframework.beans.factory.config.BeanDefinition;
import org.springframework.beans.factory.support.BeanDefinitionBuilder;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.Bean;

public class ApiDependencySetterInjectionDemo {

    public static void main(String[] args) {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(ApiDependencySetterInjectionDemo.class);

        // 生成 MyApplication 的 BeanDefinition
        BeanDefinition beanDefinition = createMyApplicationBeanDefinition();
        // 注册 MyApplication的Bean
        context.registerBeanDefinition("myApplication", beanDefinition);
        //context.refresh();
        MyApplication myApplication = context.getBean(MyApplication.class);
        myApplication.processMessage("hello bean definition", "abc@outlook.com");
        context.close();
    }

    private static BeanDefinition createMyApplicationBeanDefinition(){
        BeanDefinitionBuilder builder = BeanDefinitionBuilder.genericBeanDefinition(MyApplication.class);
        builder.addPropertyReference("service", "messageService");
        return builder.getBeanDefinition();
    }

    @Bean(name = "messageService")
    public MessageService getMessageService(){
        return new EmailService();
    }
}
