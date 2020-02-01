package com.jeason.controllor;

import org.apache.coyote.Response;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

//@Controller
//@ResponseBody
// @ResponseBody注解表示该方法的返回的结果直接写入HTTP响应正文中（ResponseBody），一般在异步获取数据时使用，
// 通常是在使用@RequestMapping后。
// 不加该注解的情况下，返回值通常解析为跳转路径，加上@ResponseBody后返回结果不会被解析为跳转路径，而是直接写入HTTP响应正文中。

@RestController  //直接用于代替上面的注解
public class TestConnection {

    @RequestMapping(value = "/test1", method = RequestMethod.GET)
    public String returnConnection() {
        return "connectoin success!";
    }



    
}
