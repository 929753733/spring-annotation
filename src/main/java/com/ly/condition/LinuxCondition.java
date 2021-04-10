package com.ly.condition;

import org.springframework.beans.factory.config.ConfigurableListableBeanFactory;
import org.springframework.beans.factory.support.BeanDefinitionRegistry;
import org.springframework.context.annotation.Condition;
import org.springframework.context.annotation.ConditionContext;
import org.springframework.core.env.Environment;
import org.springframework.core.type.AnnotatedTypeMetadata;

/**
 * @author lvyue
 * @since 2021/4/10
 */
// 判断是否是linux系统
public class LinuxCondition implements Condition {


    @Override
    public boolean matches(ConditionContext conditionContext, AnnotatedTypeMetadata annotatedTypeMetadata) {
        // 能获取到ioc使用的beanFactory。
        ConfigurableListableBeanFactory beanFactory = conditionContext.getBeanFactory();
        // 获取类加载器
        ClassLoader classLoader = conditionContext.getClassLoader();
        // 获取当前环境信息
        Environment environment = conditionContext.getEnvironment();
        // 获取到bean定义的注册类
        BeanDefinitionRegistry registry = conditionContext.getRegistry();

        String property = environment.getProperty("os.name");
        if (property.contains("linux")) {
            return true;
        }

        return false;
    }
}
