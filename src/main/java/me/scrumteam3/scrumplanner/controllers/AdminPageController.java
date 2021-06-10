package me.scrumteam3.scrumplanner.controllers;

import lombok.AllArgsConstructor;
import me.scrumteam3.scrumplanner.entities.Role;
import me.scrumteam3.scrumplanner.repositories.RoleRepository;
import me.scrumteam3.scrumplanner.repositories.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.ArrayList;
import java.util.List;

@Controller
@AllArgsConstructor
@RequestMapping(path = "/adminpanel")
public class AdminPageController {

    @Autowired
    private UserRepository userRepository;

    @Autowired
    private RoleRepository roleRepository;

    @GetMapping
    public String main(Model model) {
        List<Role> roles = new ArrayList<>();
        for (Role role: roleRepository.findAll()) {
            roles.add(role);
        }
        model.addAttribute("roles", roles);
        return "adminpanel";
    }
}
