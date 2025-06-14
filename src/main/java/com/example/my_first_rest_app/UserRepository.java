package com.example.my_first_rest_app;

import org.springframework.data.repository.CrudRepository;

import java.util.Optional;

public interface UserRepository extends CrudRepository<User, Integer> {

    //Wichtig ist, Email und Password muss genauso geschrieben werden, wie in User Klasse
    Optional<User> findByEmailAndPassword(String email, String password);
    Optional<User> findBySecret(String secret);

}
