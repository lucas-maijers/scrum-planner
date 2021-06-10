package me.scrumteam3.scrumplanner.model;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class UserRoles {
    private int id;
    private String name;

    public UserRoles(int id, String name) {
        super();
        this.id = id;
        this.name = name;
    }
}
