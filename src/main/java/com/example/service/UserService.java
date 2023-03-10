package com.example.service;

import com.example.entity.User;
import com.example.repository.Repository;
import com.example.repository.UserRepository;
import com.example.util.Jsp;

import java.util.Collection;
import java.util.Optional;

public enum UserService {
    USER_SERVICE;

    private final Repository<User> userRepository = new UserRepository();


    public void create(User user){
        userRepository.create(user);
    }
    public void update(User user){

        userRepository.update(user);
    }
    public void delete(User user){
        userRepository.delete(user);
    }
   public Collection<User> getAll(){
        return userRepository.getAll();
   }
   public Optional<User> get(Long id){
        return Optional.ofNullable(userRepository.get(id));
   }
    public Optional<User> get(String login, String password){
            User user = User
                    .builder()
                    .login(login)
                    .password(password)
                    .build();

       return userRepository.find(user).findAny();
    }
}
