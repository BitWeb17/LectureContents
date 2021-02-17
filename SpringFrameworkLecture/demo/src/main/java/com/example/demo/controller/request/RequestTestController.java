package com.example.demo.controller.request;

import com.example.demo.entity.TestMember;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping(value = "/request")
public class RequestTestController {
    private static final Logger log =
            LoggerFactory.getLogger(RequestTestController.class);

    @GetMapping("/registerForm")
    public String registerForm() {
        log.info("registerForm()");

        return "spring/request/registerForm";
    }

    @GetMapping("/register")
    public String doRegisterByParameter(
            String userId, String passwd) {

        log.info("doRegisterByParameter()");
        log.info("uesrId = " + userId);
        log.info("passwd = " + passwd);

        return "html_css/success.html";
    }

    @PostMapping("/register")
    public String doRegisterWithVoidParameter(
            String userId, String passwd) {

        log.info("doRegisterWithVoidParameter()");
        log.info("uesrId = " + userId);
        log.info("passwd = " + passwd);

        return "html_css/success.html";
    }

    @GetMapping("/registerByEntity")
    public String doRegisterByEntity(TestMember tm) {
        log.info("registerByEntity()");
        log.info("userId = " + tm.getUserName());
        log.info("passwd = " + tm.getPassword());

        return "html_css/success.html";
    }

    @PostMapping("/registerWithEntity")
    public String doregisterWithEntity(TestMember tm) {
        log.info("registerByEntity()");
        log.info("userId = " + tm.getUserName());
        log.info("passwd = " + tm.getPassword());

        return "html_css/success.html";
    }
}
