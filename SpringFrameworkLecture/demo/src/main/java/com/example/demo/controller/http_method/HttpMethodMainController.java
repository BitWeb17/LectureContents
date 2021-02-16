package com.example.demo.controller.http_method;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HttpMethodMainController {
    private static final Logger log =
            LoggerFactory.getLogger(HttpMethodMainController.class);

    @GetMapping("/httpMethodTestMain")
    public String httpMethodTestMainPage() {
        log.info("httpMethodTestMainPage()");

        return "spring/http_method/main.html";
    }
}
