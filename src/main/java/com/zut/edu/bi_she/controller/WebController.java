package com.zut.edu.bi_she.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class WebController {

    @RequestMapping(value = "/student_login")
    public String student_login() {
        return "student_login.html";
    }

    @RequestMapping(value = "/student_register")
    public String student_register() {
        return "student_register.html";
    }

}
