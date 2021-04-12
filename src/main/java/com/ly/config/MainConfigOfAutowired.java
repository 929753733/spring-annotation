package com.ly.config;

import com.ly.dao.BookDao;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;

@Configuration
@ComponentScan({"com.ly.service", "com.ly.dao", "com.ly.controller"})
public class MainConfigOfAutowired {

    @Primary // 首选装配这个bean。
    @Bean
    public BookDao bookDao() {
        BookDao bookDao = new BookDao();
        bookDao.setLable("2");
        return bookDao;
    }


}
