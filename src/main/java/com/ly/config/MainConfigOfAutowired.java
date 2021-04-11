package com.ly.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan({"com.ly.service", "com.ly.dao", "com.ly.controller"})
public class MainConfigOfAutowired {


}
