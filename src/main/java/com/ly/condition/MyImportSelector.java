package com.ly.condition;

import org.springframework.context.annotation.ImportSelector;
import org.springframework.core.type.AnnotationMetadata;

/**
 * @author lvyue
 * @since 2021/4/10
 */
// 自定义逻辑返回需要导入的组件
public class MyImportSelector implements ImportSelector {

    // 返回值，就是导入到容器中的组件全类名
    // AnnotationMetadata:当前标注@Import注解的类的所有注解信息。
    @Override
    public String[] selectImports(AnnotationMetadata annotationMetadata) {
        return new String[]{"com.ly.bean.Blue", "com.ly.bean.Yellow"};
    }
}
