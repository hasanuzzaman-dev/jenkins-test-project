package dev.hasan.jenkinstestproject.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class MyController {
    @GetMapping("/")
    public String home(){
        return "home";
    }
}
