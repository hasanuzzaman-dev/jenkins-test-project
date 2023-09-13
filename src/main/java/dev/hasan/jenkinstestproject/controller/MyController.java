package dev.hasan.jenkinstestproject.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/jenkins-test-project")
public class MyController {
    @GetMapping("/")
    public String home(){
        return "home";
    }
}
