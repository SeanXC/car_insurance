package com.example.campus.carinsurance.service;

import com.example.campus.carinsurance.entity.User;
import com.example.campus.carinsurance.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserService {
    @Autowired
    private UserRepository userRepository;
    public String register(String username)
    {
        User user = new User();
        user.setUsername(username);
        userRepository.save(user);
        return "用户" + username + "注册成功!";
    }

    public String login(String username)
    {
        User user = userRepository.findByUsername(username);
        if(user != null) {
            return "用户" + username + "登陆成功";
        }
        else
        {
            return "用户" + username + "未注册";
        }
    }
}
