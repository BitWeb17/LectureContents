package com.example.demo.controller.parameter;

import com.example.demo.controller.http_method.HttpMethodMainController;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
@RequestMapping("/param/board")
public class ParameterTestController {
    private static final Logger log =
            LoggerFactory.getLogger(ParameterTestController.class);

    @RequestMapping(value = "/get",
            method = RequestMethod.GET, params = "register")
    public String getRegisterForm() {
        log.info("/get?register");

        return "spring/parameter/register.html";
    }

    @RequestMapping(value = "/post",
            method = RequestMethod.POST, params = "register")
    public String doRegister() {
        log.info("/post(register)");

        return "spring/parameter/list.html";
    }

    @RequestMapping(value = "/get",
            method = RequestMethod.GET, params = "modify")
    public String getModifyForm() {
        log.info("/get?modify");

        return "spring/parameter/modify.html";
    }

    @RequestMapping(value = "/post",
            method = RequestMethod.POST, params = "modify")
    public String doModify() {
        log.info("/post(modify)");

        return "spring/parameter/list.html";
    }

    @RequestMapping(value = "/get",
            method = RequestMethod.GET, params = "remove")
    public String getRemoveForm() {
        log.info("/get?remove");

        return "spring/parameter/remove.html";
    }

    @RequestMapping(value = "/post",
            method = RequestMethod.POST, params = "remove")
    public String doRemove() {
        log.info("/post(remove)");

        return "spring/parameter/list.html";
    }

    @RequestMapping(value = "/get",
            method = RequestMethod.GET, params = "list")
    public String getListForm() {
        log.info("/get?list");

        return "spring/parameter/list.html";
    }

    @RequestMapping(value = "/get",
            method = RequestMethod.GET, params = "read")
    public String getReadForm() {
        log.info("/get?read");

        return "spring/parameter/read.html";
    }
}
