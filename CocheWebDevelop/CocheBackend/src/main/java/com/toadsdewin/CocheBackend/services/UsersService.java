package com.toadsdewin.CocheBackend.services;
import com.toadsdewin.CocheBackend.models.UserModel;
import com.toadsdewin.CocheBackend.repositories.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;
import java.util.Optional;

@Service
public class UserService {
    @Autowired
    UserRepository userRepository;

    //A method for save the user data;
    public void save(UserModel user) {
        this.userRepository.save(user);
    }

    public List<UserModel> getUser() {
        return this.userRepository.findAll();
    }

    public Optional<UserModel> findById(String id) {
        return this.userRepository.findById(id);
    }

    public UserModel findByUserName(String username) {
        return this.userRepository.findByUsername(username).orElse(new UserModel());
    }

    public void deleteUserbyId(String id)
    {
        userRepository.deleteById(id);
    }

}