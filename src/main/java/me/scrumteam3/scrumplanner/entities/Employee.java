package me.scrumteam3.scrumplanner.entities;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Employee {
    private Integer id;
    private String username;
    private String password;
    private Integer role;
    private String email;
}
