package com.example.projekt;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.ui.Model;

public class LandingPageController {
    @GetMapping("/start")
    public String landingPage(){
        return "start";
    }

    @PostMapping("/welcome")
    public String postingOn(Model model, @RequestParam("uName") String uName){
        return "welcome.mustache";
    }
}
