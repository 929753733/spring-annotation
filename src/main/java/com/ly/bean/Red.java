package com.ly.bean;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.BeanNameAware;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;

/**
 * @author lvyue
 * @since 2021/4/10
 */
public class Red implements ApplicationContextAware, BeanNameAware {

    private ApplicationContext applicationContext;

    public void setApplicationContext(ApplicationContext applicationContext) throws BeansException {
        System.out.println("传入的ioc：" + applicationContext);
        this.applicationContext = applicationContext;
    }

    public void setBeanName(String s) {
        System.out.println("当前bean的名字：" + s);
    }
}
