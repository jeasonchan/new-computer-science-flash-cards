package com.jeason.bean;

import lombok.Getter;
import lombok.Setter;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.PropertySource;
import org.springframework.stereotype.Component;

import java.util.Date;
import java.util.List;
import java.util.Map;

@Getter
@Setter
@Component  //将该注入到spring容器中，使其能够被获取
@ConfigurationProperties(prefix = "person") //将配置文件中的 person 反序列化成这个类
@PropertySource(value = {"classpath:person.yaml"})
public class Person {
    private String lastName;
    private Integer age;
    private Boolean isBoss;
    private Date birthday;

    private Map<String, Object> maps;
    private List<Object> objectList;
    private Dog petDog;


    @Override
    public String toString() {
        return "Person{" +
                "lastName='" + lastName + '\'' +
                ", age=" + age +
                ", isBoss=" + isBoss +
                ", birthday=" + birthday +
                ", maps=" + maps +
                ", objectList=" + objectList +
                ", petDog=" + petDog +
                '}';
    }
}
