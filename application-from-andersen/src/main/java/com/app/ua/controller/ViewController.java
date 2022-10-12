package com.app.ua.controller;

import lombok.extern.java.Log;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@Log
@RequestMapping("/lessons")
public class ViewController {
    @GetMapping("/main-page")
    public String startApp() {
        return "chooseLesson";
    }

    @GetMapping("/manage-students")
    public String startAnotherPage() {
        return "manageStudents";
    }

}
