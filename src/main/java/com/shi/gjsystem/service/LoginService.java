package com.shi.gjsystem.service;


import com.shi.gjsystem.pojo.User;


/**
 * @author SXJ
 */

public interface LoginService {
    public User loginUser(String username, String password);
}
