package me.scrumteam3.scrumplanner.entities;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;

@Table(name = "roles")
@Entity
@Getter
@Setter
public class Role {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer id;

    public Integer getId() {
        return id;
    }

    @Column(name = "name")
    private String name;

    @Column(name = "permission_level")
    private Integer permissionLevel;
}