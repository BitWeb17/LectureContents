package com.example.demo.service;

import com.example.demo.entity.Board;

import java.util.List;

public interface BoardService {
    public List<Board> list() throws Exception;

    public void register(Board board) throws Exception;
}
