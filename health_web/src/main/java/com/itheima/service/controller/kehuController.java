package com.itheima.service.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/test")
public class kehuController {

    @RequestMapping("/flag")
    public String index(){
        return "aaa";
    }
}
