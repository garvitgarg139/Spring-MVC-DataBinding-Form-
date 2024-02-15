package com.luv2code.springboot.thymeleafdemo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class DemoController {
    @GetMapping("/hello")
    public String sayhello(Model themodel){
        themodel.addAttribute("theData",new java.util.Date());
        return "helloworld";
    }

}
