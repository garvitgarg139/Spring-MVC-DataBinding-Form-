package com.luv2code.springboot.thymeleafdemo.controller;
import com.luv2code.springboot.thymeleafdemo.model.Student;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import java.util.List;

@Controller
public class StudentController {

    @Value("${countries}")
    private List<String> countries;


    @GetMapping("/showStudentForm")
    public String showForm(Model theModel){

        Student theStudent = new Student();

        theModel.addAttribute("student",theStudent);

        theModel.addAttribute("countries",countries);  //this is used when looping is used

        return "student-form2";
    }


    @PostMapping("/processStudentForm")
    public String processStudentForm(@ModelAttribute("student") Student theStudent){

        System.out.println("theStudent: "+theStudent.getFirstName()+" "+theStudent.getLastName());

        return "student-confirmation";
    }
}
