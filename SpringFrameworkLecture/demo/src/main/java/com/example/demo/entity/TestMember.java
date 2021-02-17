package com.example.demo.entity;

import lombok.Getter;
import lombok.Setter;

import java.util.List;

/* Lombok을 사용하면
   Setter, Getter 적지 않아도 알아서 만들어줌 */
@Getter
@Setter
public class TestMember {
    private String userName = "bitweb";
    private String password = "456123";
    private String introduction;
    private List<String> hobbyList;
}
