package com.toadsdewin.CocheBackend.controllers;
import com.toadsdewin.CocheBackend.models.UserModel;
import com.toadsdewin.CocheBackend.services.UsersService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@RestController
@RequestMapping("/api")
public class UserController
{
    @Autowired
    UsersService userService;

    @PostMapping("/users")
    public ResponseEntity<Map<String,String>> saveUsers(@Valid @RequestBody UserModel user)
    {
        Map<String,String> answer  = new HashMap<>();

        /**Okay, this is the line that validate if we've had created an user**/
        //user.setPassword(BCrypt.hashpw(user.getPassword(),BCrypt.gensalt()));

        UserModel us = this.userService.findByUserName(user.getUsername());

        if(us.getId()== null)
        {
            this.userService.save(user);
            answer.put("Message","The user has been introduced properly");
        }
        else
        {
            answer.put("Message","The user already exist");
        }
        return ResponseEntity.ok(answer);
    }

    /**For update an user**/
    @PutMapping("/users")
    public ResponseEntity<Map<String,String>> upgradeUsers(@Valid @RequestBody UserModel user)
    {
        this.userService.save(user);
        Map<String, String> answer = new HashMap<>();
        answer.put("Message", "The user has been upgraded properly");

        //MatchModel  auxiliarMatch = this.matchService.findMatch("61a23a41c1d97e39da71ad17");
        //auxiliarMatch.getUserModel().setName(user.getName());
        //upgradeMatch(auxiliarMatch);

        return ResponseEntity.ok(answer);
    }

    @GetMapping("/users")
    public List<UserModel> getUsers()
    {
        return this.userService.getUser();
    }

    /**This is the linecode that find the users by id**/
    @GetMapping("/users/{id}")
    public UserModel getUserById(@PathVariable String id)
    {
        return this.userService.findById(id).get();
    }

    @RequestMapping(method = RequestMethod.DELETE, value = "/users/{id}")
    public String deleteUser(@PathVariable String id)
    {
        userService.deleteUserbyId(id);
        return "User deleted by id";
    }

}
