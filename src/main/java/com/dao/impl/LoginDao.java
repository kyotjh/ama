package com.dao.impl;

import com.dao.ILoginDao;
import com.pojo.User;
import org.springframework.stereotype.Repository;

@Repository
public class LoginDao implements ILoginDao {
    public int login(User user) {
        System.out.println("LoginDao->>login");
        return 0;
    }
}
