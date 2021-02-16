package com.example.demo.controller.http_method;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

@Controller
@RequestMapping("httpMethod/board")
public class HttpMethodTestController {
    private static final Logger log =
            LoggerFactory.getLogger(HttpMethodTestController.class);

    //@RequestMapping(value = "/register", method = RequestMethod.GET)
    @GetMapping("/register")
    public String getBoardRegisterForm() {
        log.info("Get: getBoardRegisterForm()");

        return "spring/board/register.html";
    }

    @PostMapping("/register")
    public String doRegister() {
        log.info("Post: doRegister()");

        return "spring/board/register.html";
    }

    @GetMapping("/modify")
    public String getBoardModifyForm() {
        log.info("Get: getBoardModifyForm()");

        return "spring/board/modify.html";
    }

    @PostMapping("/modify")
    public String doModify() {
        log.info("Post: doModify()");

        return "spring/board/modify.html";
    }

    @GetMapping("/board/list")
    public String getBoardListForm() {
        log.info("getBoardListForm(): 정보 목록");

        return "spring/board/list.html";
    }

    @GetMapping("/board/read/{boardNo}")
    public String getBoardReadBoardNoForm(
            @PathVariable("boardNo") int boardNo) {
        log.info("getBoardReadBoardNoForm(): " +
                "게시물 번호별 읽기 = " + boardNo);

        return "spring/board/read.html";
    }

    @PostMapping("/remove")
    public String doRemove() {
        log.info("Post: doRemove()");

        return "spring/board/remove.html";
    }
}
