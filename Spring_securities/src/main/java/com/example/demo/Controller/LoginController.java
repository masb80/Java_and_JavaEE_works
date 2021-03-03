package com.example.demo.Controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;


@Controller
@RequestMapping("/")
public class LoginController {
    @GetMapping("login")
    public String getLoginView() {
        return "login";
    }
    @GetMapping("courses")
    public String goToCoursesPage() {
        return "courses";
    }
}
