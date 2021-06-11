package me.scrumteam3.scrumplanner.controllers;

import lombok.AllArgsConstructor;
import me.scrumteam3.scrumplanner.entities.Role;
import me.scrumteam3.scrumplanner.entities.User;
import me.scrumteam3.scrumplanner.repositories.RoleRepository;
import me.scrumteam3.scrumplanner.repositories.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

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

    private BCryptPasswordEncoder encoder;

    @GetMapping
    public String launchPage(Model model) {
        model.addAttribute("roles", roleRepository.findAll());
        return "adminpanel";
    }

    @RequestMapping(method = RequestMethod.POST)
    public String addNewUser(@RequestParam String username, @RequestParam Integer role, @RequestParam String email, @RequestParam String password, Model model) {
        User user = new User();
        user.setUsername(username);
        user.setRole(role);
        user.setEmail(email);
        user.setPassword(password);
        String encodedPassword = encoder.encode(user.getPassword());
        user.setPassword(encodedPassword);
        userRepository.save(user);
        model.addAttribute("userAdded", true);
        return "adminpanel";
    }

    @GetMapping(path = "/all")
    public @ResponseBody
    Iterable<User> getAllUsers() {
        return userRepository.findAll();
    }

    @GetMapping(path = "/allroles")
    public @ResponseBody Iterable<Role> getAllRoles() {
        return roleRepository.findAll();
    }
}
