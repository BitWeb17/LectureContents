package com.example.board.entity.random;

import lombok.Getter;

import java.util.Random;

@Getter
public class RandomNumber {
    private Integer randNumber = new Random().nextInt(32) + 1;
}
