package com.example.demo.controller.member;

import com.example.demo.entity.Board;
import com.example.demo.entity.Member;
import com.example.demo.service.BoardService;
import com.example.demo.service.MemberService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping(value = "/member")
public class MemberController {
    private final static Logger log =
            LoggerFactory.getLogger(MemberController.class);

    @Autowired
    private MemberService service;

    @GetMapping("/register")
    public String getMemberRegister(Member member) {
        log.info("getMemberRegister()");

        return "spring/member/register";
    }

    @PostMapping("/register")
    public String doMemberRegister(Member member, Model model) throws Exception {
        log.info("doMemberRegister()");

        service.register(member);

        model.addAttribute("msg",
                "등록이 완료되었습니다.");

        return "spring/member/success";
    }
}
