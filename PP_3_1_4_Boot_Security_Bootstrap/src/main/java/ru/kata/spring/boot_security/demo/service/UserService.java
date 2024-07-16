package ru.kata.spring.boot_security.demo.service;

import ru.kata.spring.boot_security.demo.model.User;

import java.util.List;

public interface UserService {

    default User findById(Long userId) {
        return null;
    }

    default User findByName(String name) {
        return null;
    }

    default List<User> allUsers() {
        return null;
    }

    default void saveUser(User user) {
    }

    default boolean deleteUser(Long userId) {
        return false;
    }
}
