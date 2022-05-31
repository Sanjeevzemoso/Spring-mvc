package com;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/student")
public class StudentController {


    

    @RequestMapping("/showForm")
    public String showForm( Model theModel){
        System.out.println("HI in showform student s");
        //create a student object
        Student1 theStudent = new Student1();
        //add sudent object to the model
        theModel.addAttribute("student1",theStudent);
        System.out.println("Show form students ended");
        return "student-form";
    }

    @RequestMapping("/processForm")
    public String processForm(@ModelAttribute("student1") Student1 theStudent) {

        //log the input data

        return "student-confirmation";
    }
}