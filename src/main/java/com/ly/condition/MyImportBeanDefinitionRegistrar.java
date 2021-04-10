package com.ly.condition;

import com.ly.bean.RainBow;
import org.springframework.beans.factory.support.BeanDefinitionRegistry;
import org.springframework.beans.factory.support.RootBeanDefinition;
import org.springframework.context.annotation.ImportBeanDefinitionRegistrar;
import org.springframework.core.type.AnnotationMetadata;

/**
 * @author lvyue
 * @since 2021/4/10
 */
public class MyImportBeanDefinitionRegistrar implements ImportBeanDefinitionRegistrar {

    /**
     * AnnotationMetadata:当前类的注解信息。
     * BeanDefinitionRegistry：BeanDefinition注册类，把所有添加到容器中的bean通过调用BeanDefinitionRegistry.registerBeanDefinition手工注册进来。
     */
    @Override
    public void registerBeanDefinitions(AnnotationMetadata annotationMetadata, BeanDefinitionRegistry beanDefinitionRegistry) {
        boolean definition = beanDefinitionRegistry.containsBeanDefinition("com.ly.bean.Red");
        boolean definition2 = beanDefinitionRegistry.containsBeanDefinition("com.ly.bean.Blue");
        if (definition && definition2) {
            // 指定Bean定义信息：Bean的类型，Bean。。。
            RootBeanDefinition rootBeanDefinition = new RootBeanDefinition(RainBow.class);
            beanDefinitionRegistry.registerBeanDefinition("rainBow", rootBeanDefinition);
        }
    }
}
