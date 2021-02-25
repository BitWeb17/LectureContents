package com.example.board.repository.random;

import com.example.board.entity.random.RandomNumber;
import org.springframework.stereotype.Repository;

@Repository
public class RandomNumberRepository {

    public RandomNumber getRandom() {
        return new RandomNumber();
    }
}
