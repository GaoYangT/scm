package com.son.son.service;

import com.son.son.mapper.UserMapper;
import com.son.son.pojo.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserService {
    @Autowired
    private UserMapper userMapper;

    public User getUserById(int id){
        return userMapper.selectByPrimaryKey(id);
    }
}
