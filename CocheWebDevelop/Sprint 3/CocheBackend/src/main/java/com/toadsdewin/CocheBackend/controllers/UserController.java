package com.toadsdewin.CocheBackend.controllers;
import com.toadsdewin.CocheBackend.Utils.Autorization;
import com.toadsdewin.CocheBackend.Utils.BCrypt;
import com.toadsdewin.CocheBackend.models.UserModel;
import com.toadsdewin.CocheBackend.services.CarService;
import com.toadsdewin.CocheBackend.services.UsersService;
import io.jsonwebtoken.Jwts;
import io.jsonwebtoken.SignatureAlgorithm;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import javax.validation.Valid;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@RestController
@CrossOrigin(origins = "*")
@RequestMapping("/api")
public class UserController
{
        @Autowired
        UsersService userService;

        @Autowired
        CarService carService;

        @GetMapping("/check") //Path to acces the method
        public ResponseEntity<Map<String, Boolean>> checkToken()
        { // "{"ok": true}"
            Map<String, Boolean> answer = new HashMap<>();
            answer.put("ok",true);
            return ResponseEntity.ok(answer);
       }

        @PostMapping("/users")
        public ResponseEntity<Map<String,String>>saveUsers(@RequestBody UserModel user)
        {
            Map<String,String> answer  = new HashMap<>();

            /**Okay, this is the line that validate if we've had created an user**/
            user.setPassword(BCrypt.hashpw(user.getPassword(),BCrypt.gensalt()));

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

            return ResponseEntity.ok(answer);
        }

        @PostMapping("/users/login")
        public ResponseEntity<Map<String,String>>login(@RequestBody UserModel user)
        {
            UserModel aux = this.userService.findByUserName(user.getUsername());
            Map<String,String> answer = new HashMap();
            if(aux.getUsername()==null)
            {
                answer.put("Message","The user or password is incorrect");
            }
            else
            {
                if(!BCrypt.checkpw(user.getPassword(),aux.getPassword()))
                {
                    answer.put("Message","The user or password is incorrect");
                }
                else
                {
                    String hash = "";
                    long time = System.currentTimeMillis();

                    if(aux.getId()!=null)
                    {
                        hash = Jwts.builder()
                                .signWith(SignatureAlgorithm.HS256, Autorization.KEY)
                                .setSubject(aux.getName())
                                .setIssuedAt(new Date(time))
                                .setExpiration(new Date(time+900000))
                                .claim("username",aux.getUsername())
                                .claim("email",aux.getEmail())
                                .compact();
                    }
                    aux.setHash(hash);
                    answer.put("Message","Login sucessfull!");
                    answer.put("Token",hash);
                }
            }
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
