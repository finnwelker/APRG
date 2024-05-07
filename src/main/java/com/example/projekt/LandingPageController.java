package com.example.projekt;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.ui.Model;


@Controller
public class LandingPageController {
//    @GetMapping("/start")
//    public String landingPage(){
//        return "start";
//    }

    @GetMapping("/game")
    public String gameLaunch(){
        return "game";
    }

//    @PostMapping("/welcome")
//    public String postingOn(Model model, @RequestParam("uName") String uName){
//        model.addAttribute("username", uName);
//        return "welcome";
//    }
}
