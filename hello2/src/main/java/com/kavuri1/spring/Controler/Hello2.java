package com.kavuri1.spring.Controler;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@Controller
@RestController
public class Hello2 {
    @ResponseBody
    @RequestMapping("/hello")
    public  String sayHello(){
        return "hello";
    }
}
