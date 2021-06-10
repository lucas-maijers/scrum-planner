package me.scrumteam3.scrumplanner.controllers;

import lombok.AllArgsConstructor;
import me.scrumteam3.scrumplanner.services.CustomUserDetailsService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
@AllArgsConstructor
public class UserController {

    private final CustomUserDetailsService userService;

    @GetMapping("/login")
    public String login() {
        return "login";
    }

}
