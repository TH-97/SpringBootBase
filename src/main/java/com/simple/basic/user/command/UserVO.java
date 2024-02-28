package com.simple.basic.user.command;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor //멤버변수를 받
@NoArgsConstructor  // 기본생성자
@Builder
public class UserVO {
    private int number;
    private String name;
    private int age;
    private String address;
}
