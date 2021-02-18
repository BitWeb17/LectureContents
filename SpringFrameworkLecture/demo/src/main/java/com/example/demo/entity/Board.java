package com.example.demo.entity;

import lombok.Getter;
import lombok.Setter;

import java.util.Date;

@Setter
@Getter
public class Board {
    private int boardNo;
    private String title;
    private String content;
    private String writer;
    private Date regDate;
}
