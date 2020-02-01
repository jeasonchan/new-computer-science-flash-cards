package com.jeason.controllor;

import org.apache.coyote.Response;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

//@Controller
//@ResponseBody //自动用response包装返回值，适用于方法和类，具体的

@RestController  //直接用于代替上面的注解
public class TestConnection {

    @RequestMapping(value = "/test1", method = RequestMethod.GET)
    public String returnConnection() {
        return "connectoin success!";
    }



    
}
