package com.in28minutes.rest.webservices.restfulwebservices.user;

import com.in28minutes.rest.webservices.restfulwebservices.jpa.UserRepository;
import org.springframework.hateoas.EntityModel;
import org.springframework.hateoas.server.mvc.WebMvcLinkBuilder;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;

import java.net.URI;
import java.util.List;
import java.util.Optional;

import static org.springframework.hateoas.server.mvc.WebMvcLinkBuilder.linkTo;
import static org.springframework.hateoas.server.mvc.WebMvcLinkBuilder.methodOn;

@RestController
public class UserJpaResource {

    private UserRepository repository;



    public UserJpaResource(UserRepository repository) {

        this.repository = repository;
    }

    @GetMapping("/jpa/users")
    public List<User> retrieveAllUsers() {
        return repository.findAll();
    }

    @GetMapping("/jpa/users/{id}")
    public EntityModel<User> retrieveUser(@PathVariable int id) {
        Optional<User> user = repository.findById(id);

        if (user.isEmpty()) {
            throw new UserNotFoundException("id:" + id);
        }
            EntityModel<User> entityModel = EntityModel.of(user.get());

            WebMvcLinkBuilder link = linkTo(methodOn(this.getClass()).retrieveAllUsers());
            entityModel.add(link.withRel("all-users"));
            return entityModel;
        }


        @DeleteMapping("/jpa/users/{id}")
        public void DeleteUser ( @PathVariable int id){
            repository.deleteById(id);
        }
        @PostMapping("/jpa/users")
        public ResponseEntity<User> createUser (@RequestBody User user){
            User savedUser = repository.save(user);
            URI location = ServletUriComponentsBuilder.fromCurrentRequest() //gets the current location from the current request ex. /users
                    .path("/{id}") //appends /{id} to /users . Final results: /users/{id}
                    .buildAndExpand(savedUser.getId()) // replaces the variable /{id} with the current used User Id.
                    .toUri();

            return ResponseEntity.created(location).build();
        }
    }

