package com.luv2code.springboot.thymeleafdemo.controller;

import jakarta.servlet.http.HttpServletRequest;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class HelloWorldController {


    @RequestMapping("/showForm")
    public String showForm(){
        return "helloworld-form";
    }


    @RequestMapping("/processForm")
    public String processForm(){
        return "helloworld";
    }


    @RequestMapping("readData")
    public String readData(HttpServletRequest request, Model model){
        String theName=request.getParameter("studentname");
        theName=theName.toLowerCase();
        String result ="Hi!" + theName;
        model.addAttribute("message",result);
        return "helloworld";
    }


    @RequestMapping("/readDataVersion2")
    public String readDataVersion2(@RequestParam("studentname")
                                   String theName, Model model){
        theName=theName.toLowerCase();
        String result ="Hi There!" + theName;
        model.addAttribute("message",result);
        return "helloworld";
    }
}
