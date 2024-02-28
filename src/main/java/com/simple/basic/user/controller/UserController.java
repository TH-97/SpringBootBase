package com.simple.basic.user.controller;

import com.simple.basic.user.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller //controller java class 안에는 @Controller를 꼭 해줘야 한다
//@RequestMapping("/user")
public class UserController {

    @Autowired
    @Qualifier("UserServiceImpl")
    //컨트롤러의 다음 흐름은 바로 service이기때문에 @Qualifier를 이용하여 지정해서 바로가져온다
    private UserService userService;

    @GetMapping("/")
    public String Home(){
        System.out.println("홈페이지에 들어옴");

        return "Home"; //resoures 하위에 있는 templates 하위에 있는 html불어오기
    }


}
