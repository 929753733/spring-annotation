package com.ly.test;

import com.ly.bean.Person;
import com.ly.config.MainConfigOfAutowired;
import com.ly.config.MainConfigOfPropertyValues;
import com.ly.dao.BookDao;
import com.ly.service.BookService;
import org.junit.Test;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.core.env.ConfigurableEnvironment;

/**
 * @author lvyue
 * @since 2021/4/10
 */
public class IOCTest_Autowired {

    @Test
    public void test01() {
        AnnotationConfigApplicationContext applicationContext = new AnnotationConfigApplicationContext(MainConfigOfAutowired.class);
        BookService bean = applicationContext.getBean(BookService.class);
        System.out.println(bean);

        BookDao bookDao = applicationContext.getBean(BookDao.class);
        System.out.println(bookDao);
        // 关闭容器
        applicationContext.close();
    }

}
