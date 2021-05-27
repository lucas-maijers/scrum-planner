package me.scrumteam3.scrumplanner.database.repositories;

import me.scrumteam3.scrumplanner.database.entities.User;
import org.springframework.data.repository.CrudRepository;

public interface UserRepository extends CrudRepository<User, Integer> {
}
