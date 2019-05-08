package com.son.son.controller;

import com.son.son.pojo.User;
import com.son.son.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@Controller
public class UserController {
    @Autowired
    private UserService userService;
    @ResponseBody
    @RequestMapping("/pro/{id}")
    public User pro(@PathVariable(value = "id") int id){
        return userService.getUserById(id);
    }
}
