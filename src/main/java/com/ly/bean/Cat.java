package com.ly.bean;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;
import org.springframework.stereotype.Component;

/**
 * @author lvyue
 * @since 2021/4/10
 */
@Component
public class Cat implements InitializingBean, DisposableBean, ApplicationContextAware {

    public Cat() {

    }

    @Override
    public void destroy() throws Exception {
        System.out.println("++++++++++++++++cat...destroy...");
    }

    @Override
    public void afterPropertiesSet() throws Exception {
        System.out.println("++++++++++++++++cat...afterPropertiesSet...");
    }

    @Override
    public void setApplicationContext(ApplicationContext applicationContext) throws BeansException {
        System.out.println("++++++++++++++++" + applicationContext);
    }
}
