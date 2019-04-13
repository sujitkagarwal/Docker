package com.sa.micro.repository;

import com.sa.micro.entity.User;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

/**
 * Authur : sujitagarwal
 * Created: 09/10/18.
 */
public interface UserRepository extends CrudRepository<User, Integer> {

    List<User> findAll();
    User save(User user);
}
