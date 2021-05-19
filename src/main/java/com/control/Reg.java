package com.control;

import org.springframework.stereotype.Controller;
import org.springframework.stereotype.Repository;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import javax.servlet.http.HttpServletRequest;

@Controller
@RequestMapping("reg")
public class Reg {
    @RequestMapping(params = {"pass"},value = "lg",method = RequestMethod.POST)
    public String login(String name){
        System.out.println(name);
        return "/index.jsp";
    }

    @RequestMapping(value="a/{uid}/lg2")
    public String login2(@RequestParam("name") String na, @PathVariable("uid") String userId){
        System.out.println("lg2....."+na);
        System.out.println("userId.."+userId);
        return "/index.jsp";
    }

    @RequestMapping("ts")
    public String tst(Model req){
        req.addAttribute("ss","fff");
        System.out.println("reg....666");
        return "/index.jsp";
    }

}
