package com.ly.test;

import com.ly.bean.Person;
import com.ly.config.MainConfig;
import com.ly.config.MainConfig2;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import java.util.Map;

/**
 * @author lvyue
 * @since 2021/4/10
 */
public class IOCTest {

    @Test
    public void testImport() {
        AnnotationConfigApplicationContext applicationContext = new AnnotationConfigApplicationContext(MainConfig2.class);
        printBeans(applicationContext);

        // 工厂Bean获取的是调用FactoryBean.getObject()创建的对象。
        Object colorFactoryBean = applicationContext.getBean("colorFactoryBean");
        Object colorFactoryBean2 = applicationContext.getBean("colorFactoryBean");
        System.out.println("bean的类型：" + colorFactoryBean.getClass());
        System.out.println(colorFactoryBean == colorFactoryBean2);
    }

    private void printBeans(AnnotationConfigApplicationContext applicationContext) {
        String[] definitionNames = applicationContext.getBeanDefinitionNames();
        for (String name : definitionNames) {
            System.out.println(name);
        }
    }

    @Test
    public void test03() {
        AnnotationConfigApplicationContext applicationContext = new AnnotationConfigApplicationContext(MainConfig2.class);
        String[] namesForType = applicationContext.getBeanNamesForType(Person.class);
        for (String name : namesForType) {
            System.out.println(name);
        }

        Map<String, Person> persons = applicationContext.getBeansOfType(Person.class);
        System.out.println(persons);
    }

    @Test
    public void test02() {
        ApplicationContext applicationContext = new AnnotationConfigApplicationContext(MainConfig2.class);
        String[] definitionNames = applicationContext.getBeanDefinitionNames();
        for (String name : definitionNames) {
            System.out.println(name);
        }

    }

    @Test
    public void test01() {
        ApplicationContext applicationContext = new AnnotationConfigApplicationContext(MainConfig.class);
        String[] definitionNames = applicationContext.getBeanDefinitionNames();
        for (String name : definitionNames) {
            System.out.println(name);
        }

    }
}
