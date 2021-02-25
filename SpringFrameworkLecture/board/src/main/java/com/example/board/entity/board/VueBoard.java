package com.example.board.entity.board;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import java.util.Date;

@Getter
@Setter
@ToString
public class VueBoard {
    private long boardNo;
    private String title;
    private String content;
    private String writer;
    private Date regDate;
}
