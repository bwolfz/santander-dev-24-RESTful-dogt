package com.kilder.controller;


import com.kilder.domain.model.Trainer;
import com.kilder.service.UserService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;

import java.net.URI;

@RestController
@RequestMapping("/users")
public class UserController {

    private final UserService userService;

    public UserController(UserService userService){
        this.userService = userService;
    }

    @GetMapping("/{id}")
    public ResponseEntity<Trainer> findById(@PathVariable Integer id){
        var user = userService.fingById(id);
        return ResponseEntity.ok(user);
    }

    @PostMapping
    public ResponseEntity<Trainer> create(@RequestBody Trainer trainerToCreate){
        var userCreated = userService.create(trainerToCreate);
        URI location = ServletUriComponentsBuilder.fromCurrentRequest()
                .path("/{id}")
                .buildAndExpand(userCreated.getId())
                .toUri();
        return ResponseEntity.created(location).body(userCreated);
    }
}
