package edu.miu.cs.cs425.demowebapps.elibrary.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HomePageController {

    @GetMapping(value ={ "/","/elibrary","/elibrary/home"})
    public String displayHomePage(){
        return "home/index";
    }
}
