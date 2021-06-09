package me.scrumteam3.scrumplanner.repositories;

import me.scrumteam3.scrumplanner.data.User;
import org.springframework.data.repository.CrudRepository;

import java.util.Optional;

public interface UserRepository extends CrudRepository<User, Integer> {
    Optional<User> findByEmail(String email);

    Optional<User> findByUsername(String username);
}
