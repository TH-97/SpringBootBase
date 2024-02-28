package com.simple.basic.user.service;

import com.simple.basic.user.mapper.UserMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service("UserServiceImpl") //controller에서 가져가기 쉽게 이름을 지정래준다
public class UserServiceImpl implements UserService {

    @Autowired //service와 연결 되어 있는 Mapper를 찾아서 지정해둔다
    private UserMapper userMapper;
}
