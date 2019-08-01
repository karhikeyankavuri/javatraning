package com.kavri.helloWorld.controller;


import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/")
public class Hello {


//    @RequestMapping(method = RequestMethod.GET, value = "/g")
//    public String getDetails(@RequestParam String s){
//        return "hello"+s;
//    }
    @GetMapping("/api/foos/")
    @ResponseBody
    public String getFoos(@RequestParam String id) {
        return "ID: " + id;
    }
//    @RequestMapping(method = RequestMethod.POST,value = "/post")
//    public String postDetails(@ResponseBody String d ){
//        return d;
//    }
}
