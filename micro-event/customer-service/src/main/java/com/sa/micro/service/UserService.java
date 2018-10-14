package com.sa.micro.service;

import com.sa.micro.entity.User;

import java.util.List;

/**
 * Authur : sujitagarwal
 * Created: 09/10/18.
 */
public interface UserService {
    List<User> findAll();
}
