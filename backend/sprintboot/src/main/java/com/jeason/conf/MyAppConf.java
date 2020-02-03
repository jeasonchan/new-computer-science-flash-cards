package com.jeason.conf;


import com.jeason.bean.Person;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration//指定当前类是配置类，来替代之前spring的配置文件；此处，也就是使用Java类作为装配依据
public class MyAppConf {

    @Bean//将方法的返回值放入容器，默认ID是方法名
    public Person person2() {
        return null;
    }
}
