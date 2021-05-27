package me.scrumteam3.scrumplanner.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestController {

    @GetMapping("/saytest")
    public String sayTest() {
        return "Test";
    }
}
