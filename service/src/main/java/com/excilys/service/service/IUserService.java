package com.excilys.service.service;


import com.excilys.core.model.User;

public interface IUserService {
    User findById(int id);

    User findByName(String username);

    User create(User user);

    void defaultValues();
}
