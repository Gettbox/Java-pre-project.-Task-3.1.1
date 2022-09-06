package com.example.demo.dao;

import com.example.demo.model.User;

import java.util.List;

public interface UserDao {

    List<User> getUserList();

    User getById(int id);

    void add(User user);

    void update(int id, User user);

    void delete(int id);
}