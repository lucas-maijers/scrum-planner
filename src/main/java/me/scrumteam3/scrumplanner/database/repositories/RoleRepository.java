package me.scrumteam3.scrumplanner.database.repositories;

import me.scrumteam3.scrumplanner.database.entities.Role;
import org.springframework.data.repository.CrudRepository;

public interface RoleRepository extends CrudRepository<Role, Integer> {
}
