package com.example.my_first_rest_app;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TodoController {

    @GetMapping("/greet")
    public ResponseEntity<String> hello(@RequestParam(value = "name") String name) {

        if(name.equals("admin")) {
            return new ResponseEntity<String>("Hello " + name, HttpStatus.OK);
        }

        return new ResponseEntity<String>("Error", HttpStatus.BAD_REQUEST);
    }
}
