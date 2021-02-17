package com.example.demo.controller.exercise;

import com.example.demo.entity.TestMember;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
@RequestMapping(value = "/exercise")
public class ExerciseController {
    private static final Logger log =
            LoggerFactory.getLogger(ExerciseController.class);

    @GetMapping("/home")
    public String getHome() {
        log.info("getHome()");

        return "spring/exercise/main";
    }

    @RequestMapping(value = "/home",
            method = RequestMethod.GET, params = "register")
    public String getRegisterForm(Model model) {
        log.info("/home?register");

        model.addAttribute("testMember", new TestMember());

        return "spring/thyme/registerForm";
    }
}
