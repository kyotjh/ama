package com.control;

import com.alibaba.fastjson.JSONObject;
import com.pojo.User;
import com.service.ILogin;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.annotation.Resource;
import javax.servlet.http.HttpSession;
import java.io.InputStream;

@Controller
public class Login {

    //@Resource
//    @Autowired //只按类型注入
//    @Qualifier("lg1")   //结合@Autowired 表示按名字去spring容器中获取
//    ILogin ls;

    @Resource(type = ILogin.class,name="lg1")
    ILogin ls;

    @RequestMapping("lg")
    @ResponseBody
    public String login(@ModelAttribute("ss") String a, User u, HttpSession hs, InputStream is){
        System.out.println("control->>>>login:"+u);
        ls.Login(u);
        JSONObject js = new JSONObject();
        js.put("k1","v1");
        js.put("k2","v2");
        return js.toString();
    }

    public String lg(){
        return "";
    }

}
