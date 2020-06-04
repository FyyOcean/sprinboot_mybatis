package com.baizhi.controller;

import com.baizhi.entity.User;
import com.baizhi.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

/**
 * Created by Fy_ on 2020/6/3 17:07
 */
@Controller
@RequestMapping("user")
public class UserController {
    @Autowired
    private UserService userservice;
    @RequestMapping("save")
    public String save(User user){
        userservice.save(user);
        return"redirect:/user/findAll";
    }

    //查询所有user
    @RequestMapping("findAll")
    public String findAll(Model model){
        List<User> users = userservice.findAll();
        model.addAttribute("users",users);
        return "showAll";
    }

}
