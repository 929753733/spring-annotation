package com.ly.bean;

import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;
import org.springframework.stereotype.Component;

/**
 * @author lvyue
 * @since 2021/4/10
 */
@Component
public class Cat implements InitializingBean, DisposableBean {

    public Cat() {

    }

    @Override
    public void destroy() throws Exception {
        System.out.println("cat...destroy...");
    }

    @Override
    public void afterPropertiesSet() throws Exception {
        System.out.println("cat...afterPropertiesSet...");
    }
}
