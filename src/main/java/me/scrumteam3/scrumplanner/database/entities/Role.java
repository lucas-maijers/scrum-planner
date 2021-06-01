package me.scrumteam3.scrumplanner.database.entities;

import javax.persistence.*;

@Entity
@Table(name="roles")
public class Role {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer id;

    private String name;

    private Integer permission_level;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getPermission_level() {
        return permission_level;
    }

    public void setPermission_level(Integer permission_level) {
        this.permission_level = permission_level;
    }
}
