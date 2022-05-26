package com.stepan.cupriyanovich.service;

import com.stepan.cupriyanovich.model.User;

import java.util.List;

public interface UserService {
    List<User> getAllUsers();
    void saveUser(User user);
    void deleteUserById(int id);
    void updateUser(User user);
    User getUserById(int id);
}
