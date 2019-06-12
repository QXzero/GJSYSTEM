package com.shi.gjsystem.service.impl;



import com.shi.gjsystem.mapper.LoginMapper;
import com.shi.gjsystem.pojo.User;
import com.shi.gjsystem.service.LoginService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

/**
 * @author SXJ
 */
@Service
public class LoginServiceImpl implements LoginService {

    @Resource
    private LoginMapper loginMapper;
    @Override
    public User loginUser(String username, String password) {
        //System.out.println("123");
        return loginMapper.loginUser(username,password);
    }
}
