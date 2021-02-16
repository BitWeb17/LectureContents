package com.example.demo.controller.path;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

@Controller
public class PathVariableTestController {
    private static final Logger log =
            LoggerFactory.getLogger(PathVariableTestController.class);

    @GetMapping("/board/register")
    public String getBoardRegister() {
        log.info("getBoardRegister(): 회원가입");

        return "spring/board/register.html";
    }

    @GetMapping("/board/modify")
    public String getBoardModify() {
        log.info("getBoardModify(): 정보 수정");

        return "spring/board/modify.html";
    }

    @GetMapping("/board/list")
    public String getBoardList() {
        log.info("getBoardList(): 정보 목록");

        return "spring/board/list.html";
    }

    @GetMapping("/board/read/{boardNo}")
    public String getBoardReadBoardNo(
            @PathVariable("boardNo") int boardNo) {
        log.info("getBoardReadBoardNo(): " +
                "게시물 번호별 읽기 = " + boardNo);

        return "spring/board/read.html";
    }
}
