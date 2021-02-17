package com.example.demo.controller.nativeinterface;

import com.example.demo.controller.response.ResponseTestController;
import com.example.demo.nativeinterface.HelloSpring;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class NativeController {
    private static final Logger log =
            LoggerFactory.getLogger(NativeController.class);

    Object test;

    @GetMapping("/nativeTest")
    public String nativeCallTestHello() {
        log.info("nativeCallTestHello()");

        HelloSpring hs = new HelloSpring();
        log.info(hs.print());

        return "html_css/success.html";
    }
}
