package com.ly.controller;

import com.ly.service.BookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

/**
 * @author lvyue
 * @since 2021/4/10
 */
@Controller
public class BookControlller {

    @Autowired
    private BookService bookService;
}
