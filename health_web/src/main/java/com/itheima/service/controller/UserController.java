package com.itheima.service.controller;

import com.alibaba.dubbo.config.annotation.Reference;
import com.itheima.service.userService.UserInterface;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;



@RestController
@RequestMapping("/user")
public class UserController {


    @Reference
    UserInterface userInterface;


    @GetMapping("/index")
    public  String  testDubbo(){
        String dubbo = userInterface.testDubbo();
        return dubbo;

    }


}
