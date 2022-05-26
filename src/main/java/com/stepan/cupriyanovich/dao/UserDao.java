package com.stepan.cupriyanovich.dao;

import com.stepan.cupriyanovich.model.User;

import java.util.List;

public interface UserDao {
    List<User> getAllUsers();
    void saveUser(User user);
    void deleteUserById(int id);
    void updateUser(User user);
    User getUserById(int id);
}
