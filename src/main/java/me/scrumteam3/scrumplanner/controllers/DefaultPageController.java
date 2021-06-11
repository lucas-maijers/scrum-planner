package me.scrumteam3.scrumplanner.controllers;

import lombok.AllArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@AllArgsConstructor
@RequestMapping("/")
public class DefaultPageController {

    @GetMapping
    public String main() {
        return "redirect:/login";
    }

}
