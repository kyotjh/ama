package com.service.impl;

import com.pojo.User;
import com.service.ILogin;
import org.springframework.stereotype.Service;

@Service
public class LoginService implements ILogin {
    public int Login(User u) {
        System.out.println("5555");
        return 0;
    }
}
