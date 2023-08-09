package com.in28minutes.rest.webservices.restfulwebservices.user;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;

import java.net.URI;
import java.util.List;

@RestController
public class UserResource {

    private UserDaoService service;

    public UserResource(UserDaoService service){
        this.service = service;
    }

    @GetMapping("/users")
    public List<User> retrieveAllUsers(){
        return service.findAll();
    }

    @GetMapping("/users/{id}")
    public User retrieveUser(@PathVariable int id){
        User user = service.findOne(id);

        if (user == null){
            throw new UserNotFoundException("id:"+id);
        }
        return user;
    }


    @DeleteMapping("/users/{id}")
    public void DeleteUser(@PathVariable int id){
        service.deleteById(id);
    }
    @PostMapping("/users")
    public ResponseEntity<User> createUser(@RequestBody User user){
        User savedUser = service.save(user);
        URI location = ServletUriComponentsBuilder.fromCurrentRequest() //gets the current location from the current request ex. /users
                .path("/{id}") //appends /{id} to /users . Final results: /users/{id}
                .buildAndExpand(savedUser.getId()) // replaces the variable /{id} with the current used User Id.
                .toUri();

        return ResponseEntity.created(location).build();
    }
}
