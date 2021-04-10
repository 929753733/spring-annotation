package com.ly.test;

import com.ly.config.MainConfigOfLifeCycle;
import org.junit.Test;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * @author lvyue
 * @since 2021/4/10
 */
public class IOCTest_LifeCycle {

    @Test
    public void test01() {
        // 创建IOC容器
        AnnotationConfigApplicationContext applicationContext = new AnnotationConfigApplicationContext(MainConfigOfLifeCycle.class);
        System.out.println("容器创建完成。。。");

        // 关闭容器
        applicationContext.close();

    }

}
