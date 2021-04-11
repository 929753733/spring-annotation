package com.ly.test;

import com.ly.bean.Person;
import com.ly.config.MainConfigOfLifeCycle;
import com.ly.config.MainConfigOfPropertyValues;
import org.junit.Test;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.core.env.ConfigurableEnvironment;

/**
 * @author lvyue
 * @since 2021/4/10
 */
public class IOCTest_PropertyValue {

    AnnotationConfigApplicationContext applicationContext = new AnnotationConfigApplicationContext(MainConfigOfPropertyValues.class);



    @Test
    public void test01() {
        printBeans(applicationContext);
        System.out.println("==========");

        Person person = (Person) applicationContext.getBean("person");
        System.out.println(person);

        ConfigurableEnvironment environment = applicationContext.getEnvironment();
        // 配置文件中的值默认都加载到了环境变量中。
        String property = environment.getProperty("person.nickName");
        System.out.println(property);

        // 关闭容器
        applicationContext.close();
    }

    private void printBeans(AnnotationConfigApplicationContext applicationContext) {
        String[] definitionNames = applicationContext.getBeanDefinitionNames();
        for (String name : definitionNames) {
            System.out.println(name);
        }
    }

}
