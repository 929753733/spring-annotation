package com.ly.bean;

import org.springframework.beans.factory.FactoryBean;

/**
 * @author lvyue
 * @since 2021/4/10
 */
// 创建一个Spring定义的FactoryBean
public class ColorFactoryBean implements FactoryBean<Color> {

    // 返回一个Color对象，这个对象会添加到容器中.
    @Override
    public Color getObject() throws Exception {
        System.out.println("ColorFactoryBean...");
        return new Color();
    }

    @Override
    public Class<?> getObjectType() {
        return Color.class;
    }

    // 是单例？
    // true:这个bean是单实例
    // false:多实例
    @Override
    public boolean isSingleton() {
        return true;
    }
}
