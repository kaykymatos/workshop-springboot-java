package com.github.kaykymatos.course.services;

import com.github.kaykymatos.course.entities.User;
import com.github.kaykymatos.course.repositories.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserService {
    @Autowired
    private UserRepository userRepository;

    public List<User> fidAll() {
        return userRepository.findAll();
    }

    public User findById(Long id) {
        return userRepository.findById(id).orElse(null);
    }

    public User insert(User user) {
        return userRepository.save(user);
    }

    public void delete(Long id) {
        userRepository.deleteById(id);
    }

    public User update(Long id,User user) {
        User entity = userRepository.getReferenceById(id);
        updateData(entity,user);
       return userRepository.save(entity);
    }
    private void updateData(User entity, User user){
        entity.setEmail(user.getEmail());
        entity.setName(user.getName());
        entity.setPhone(user.getPhone());
    }
}
