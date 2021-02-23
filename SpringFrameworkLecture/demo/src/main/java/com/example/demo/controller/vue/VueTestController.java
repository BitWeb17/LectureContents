package com.example.demo.controller.vue;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class VueTestController {
    private final static Logger log =
            LoggerFactory.getLogger(VueTestController.class);

    @GetMapping("/vuemain")
    public String getVueMain() {
        log.info("getVueMain()");

        return "vue/main";
    }

    @GetMapping("/vuegame")
    public String getVueGame() {
        log.info("getVueGame()");

        return "vue/game";
    }

    @GetMapping("/vueGameStart")
    public String getVueGameStart() {
        log.info("getVueGameStart()");

        return "vue/gameStart";
    }

    @GetMapping("/vueMultiCheckBox")
    public String getVueMultiCheckBox() {
        log.info("getVueMultiCheckBox()");

        return "vue/multiCheckBox";
    }
}
