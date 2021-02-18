package com.example.demo.controller.board;

import com.example.demo.entity.Board;
import com.example.demo.service.BoardService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping(value = "/real_board")
public class BoardController {
    private static final Logger log =
            LoggerFactory.getLogger(BoardController.class);

    @Autowired
    private BoardService service;

    @GetMapping("/list")
    public String getList(Model model) throws Exception {
        log.info("getList()");

        model.addAttribute("list", service.list());

        return "spring/real_board/list";
    }

    @PostMapping("/register")
    public String doRegister(Board board, Model model)
            throws Exception {

        log.info("doRegister()");

        service.register(board);

        model.addAttribute("msg",
                "등록이 완료되었습니다.");

        return "spring/real_board/success";
    }
}
