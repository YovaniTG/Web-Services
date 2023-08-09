package com.in28minutes.rest.webservices.restfulwebservices.user;

import org.springframework.stereotype.Component;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;

@Component
public class UserDaoService {
//DAO Data access Object
// JPA/Hibernate > Database
// UserDaoService > Static Lists
 private static List<User> users = new ArrayList<>();
    public static int usersCount=0;
 static {
     users.add(new User(++usersCount,"Velma", LocalDate.now().minusYears(30)));
     users.add(new User(++usersCount,"Shaggy", LocalDate.now().minusYears(28)));
     users.add(new User(++usersCount,"Scooby", LocalDate.now().minusYears(11)));
 }
    //methods:

    public List<User> findAll(){
     return users;
    }

    public User save(User user){
     user.setId(++usersCount);
     users.add(user);

     return user;
    }

    public User findOne(int id){
        Predicate<? super User> predicate = user -> user.getId().equals(id);
        return users.stream().filter(predicate).findFirst().orElse(null);
    }


    public void deleteById(int id){
        Predicate<? super User> predicate = user -> user.getId().equals(id);
        users.removeIf(predicate);
    }
    // public User save(User user){
    //public User findOne(int id)




}
