package com.ly.config;

import com.ly.bean.Person;
import com.ly.service.BookService;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.FilterType;
import org.springframework.stereotype.Controller;
import org.springframework.stereotype.Service;

/**
 * @author lvyue
 * @since 2021/4/10
 */
@Configuration // 高速spring这是一个配置类。
@ComponentScan(value = "com.ly", includeFilters = {
//        @ComponentScan.Filter(type = FilterType.ANNOTATION, classes = {Controller.class}),
//        @ComponentScan.Filter(type = FilterType.ASSIGNABLE_TYPE, classes = {BookService.class}),
        @ComponentScan.Filter(type = FilterType.CUSTOM, classes = {MyTypeFilter.class})
}, useDefaultFilters = false) // 如果想要includeFilters生效，则必须将@ComponentScan中的useDefaultFilters属性设置为false，不然的话includeFilters是不起作用的。
// @ComponentScan value:指定要扫描的包
// excludeFilters = Filter[]:指定扫描的时候按照什么规则排除那些组件。
// includeFilters = Filter[]:指定扫描的时候只需要包含哪些组件。
// FilterType.ANNOTATION：按照注解
// FilterType.ASSIGNABLE_TYPE:按照给定的类型
// FilterType.ASPECTJ:使用ASPECTJ表达式
// FilterType.REGEX:使用正则指定
// FilterType.CUSTOM:使用自定义规则
public class MainConfig {

    @Bean(value = "aaa") // 给容器中注册一个bean，类型为返回值的类型，id默认是用方法名作为id。
    public Person person() {
        return new Person("lisi", 20);
    }

}
