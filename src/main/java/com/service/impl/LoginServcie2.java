package com.service.impl;

import com.dao.ILoginDao;
import com.dao.impl.LoginDao;
import com.pojo.User;
import com.service.ILogin;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

//此时会加载到spring容器中，并且有默认id
//默认id = 类名(首字母自动改为小写)
@Service("lg1")
public class LoginServcie2 implements ILogin {
    @Autowired
    ILoginDao ld;

    public int Login(User u) {
        System.out.println("LoginServcie2->Login");
        ld.login(u);
        return 0;
    }
}
