package com.ly.bean;

import org.springframework.stereotype.Component;

/**
 * @author lvyue
 * @since 2021/4/10
 */
@Component
public class Car {

    public Car() {
        System.out.println("car constructor...");
    }

    public void init() {
        System.out.println("car...init...");
    }

    public void destroy() {
        System.out.println("car...destroy...");
    }

}
