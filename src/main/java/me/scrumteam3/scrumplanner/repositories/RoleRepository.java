package me.scrumteam3.scrumplanner.repositories;

import me.scrumteam3.scrumplanner.data.Role;
import org.springframework.data.repository.CrudRepository;

import java.util.Optional;

public interface RoleRepository extends CrudRepository<Role, Integer> {

    Optional<Role> findByName(String name);
}
