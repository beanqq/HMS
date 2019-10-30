package com.itheima.service.userService;

import com.alibaba.dubbo.config.annotation.Service;
import com.itheima.service.userService.UserInterface;

@Service  //dubbo注解service,代表服务提供者
public class UserServiceImpl  implements UserInterface {
    @Override
    public String testDubbo() {
        return "hello,dubbo";

    }
}
