package com.ly.config;

import com.ly.bean.Color;
import com.ly.bean.Person;
import com.ly.bean.Red;
import com.ly.condition.LinuxCondition;
import com.ly.condition.MyImportBeanDefinitionRegistrar;
import com.ly.condition.MyImportSelector;
import com.ly.condition.WindowsCondition;
import org.springframework.context.annotation.*;

/**
 * @author lvyue
 * @since 2021/4/10
 */
@Configuration
@Import({Color.class, Red.class, MyImportSelector.class, MyImportBeanDefinitionRegistrar.class}) // @Import导入组件，id默认是组件的全类名
public class MainConfig2 {

    @Scope
    @Bean(value = "person")
    public Person person() {
        return new Person("张三", 25);
    }

    /**
     * @Conditional({Condition}):按照一定的条件进行判断，满足条件给哦让其中注册bean。
     */
    @Conditional({WindowsCondition.class})
    @Bean(value = "bill")
    public Person person01() {
        return new Person("Bill Gates", 62);
    }

    @Conditional({LinuxCondition.class})
    @Bean(value = "linus")
    public Person person02() {
        return new Person("linus", 48);
    }
}
