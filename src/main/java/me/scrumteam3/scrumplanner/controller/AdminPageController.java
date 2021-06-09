package me.scrumteam3.scrumplanner.controller;

import lombok.AllArgsConstructor;
import me.scrumteam3.scrumplanner.data.Role;
import me.scrumteam3.scrumplanner.data.User;
import me.scrumteam3.scrumplanner.repositories.RoleRepository;
import me.scrumteam3.scrumplanner.repositories.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@Controller
@AllArgsConstructor
@RequestMapping(path = "/adminpanel")
public class AdminPageController {

    @Autowired
    private UserRepository userRepository;

    @Autowired
    private RoleRepository roleRepository;

    private BCryptPasswordEncoder bCryptPasswordEncoder;

    @GetMapping
    public String main(Model model) {
        model.addAttribute("role", roleRepository.findAll());
        return "adminpanel";
    }

    @PostMapping(path = "/addUser")
    public @ResponseBody
    String addNewUser(@RequestParam String username, @RequestParam Integer role, @RequestParam String email, @RequestParam String password) {
        User n = new User();
        n.setUsername(username);
        n.setRole(roleRepository.findById(role).get().getId());
        n.setEmail(email);
        n.setPassword(password);
        String encodedPassword = bCryptPasswordEncoder.encode(n.getPassword());
        n.setPassword(encodedPassword);
        userRepository.save(n);
        return "User added";
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
