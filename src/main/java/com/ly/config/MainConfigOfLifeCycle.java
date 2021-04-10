package com.ly.config;

import com.ly.bean.Car;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Component;

/**
 * @author lvyue
 * @since 2021/4/10
 */
@ComponentScan(value = "com.ly.bean")
@Configuration
public class MainConfigOfLifeCycle {

    @Bean(initMethod = "init", destroyMethod = "destroy")
    public Car car() {
        return new Car();
    }

}
