package com.jeason.controllor;

import org.apache.coyote.Response;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class TestConnection {

    @RequestMapping(value = "/test1", method = RequestMethod.GET)
    @ResponseBody //自动用response包装返回值，能否直接使用Response作为返回值？？
    public String returnConnection() {
        return "connectoin success!";
    }



    
}
