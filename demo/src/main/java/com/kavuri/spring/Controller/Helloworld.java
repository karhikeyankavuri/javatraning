package com.kavuri.spring.Controller;


import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@EnableAutoConfiguration
public class Helloworld {
    @RequestMapping("/heloo")
@ResponseBody
    public String Sayhello(){
    return "hello";
}

}
