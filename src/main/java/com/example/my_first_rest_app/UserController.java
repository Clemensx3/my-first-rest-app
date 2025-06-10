package com.example.my_first_rest_app;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
public class UserController {

    @Autowired
    private UserRepository userRepository;

    @PostMapping("/register")
    private ResponseEntity<User> register(@RequestBody User newUser) {
        var savedUser = userRepository.save(newUser);
        return new ResponseEntity<User>(savedUser, HttpStatus.CREATED);
    }

    @GetMapping("/user")
    private ResponseEntity<User> getUser(@RequestParam(value = "id") int id) {
        var user = userRepository.findById(id);

        if(user.isPresent()) {
            return new ResponseEntity<User>(user.get(), HttpStatus.OK);
        }
        return new ResponseEntity("User with id " + id + " could not be found", HttpStatus.NOT_FOUND);

    }


}
