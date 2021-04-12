package com.ly.dao;

import org.springframework.stereotype.Repository;

/**
 * @author lvyue
 * @since 2021/4/10
 */
@Repository
public class BookDao {

    private String lable;

    public String getLable() {
        return lable;
    }

    public void setLable(String lable) {
        this.lable = lable;
    }

    public BookDao() {
    }

    public BookDao(String lable) {
        this.lable = lable;
    }

    @Override
    public String toString() {
        return "BookDao{" +
                "lable='" + lable + '\'' +
                '}';
    }

}
