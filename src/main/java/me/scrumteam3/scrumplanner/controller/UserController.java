package me.scrumteam3.scrumplanner.controller;

import lombok.AllArgsConstructor;
import me.scrumteam3.scrumplanner.data.User;
import me.scrumteam3.scrumplanner.services.CustomUserDetailsService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
@AllArgsConstructor
public class UserController {

    private final CustomUserDetailsService userService;

    @GetMapping("/login")
    public String login() {
        return "login";
    }

    @PostMapping("/signup")
    public String signUp(User user) {
        return "redirect:/login";
    }

}
