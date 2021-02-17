package com.example.demo.controller.thymeleaf;

import com.example.demo.entity.TestMember;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping(value = "/thymeleaf")
public class ThymeLeafTestController {
    private static final Logger log =
            LoggerFactory.getLogger(ThymeLeafTestController.class);

    // 'TestMember' available as request attribute
    // 속성 설정이 안되어 있다는 에러 메시지가 나타난다.
    @GetMapping("/registerForm001")
    public String registerForm001() {
        log.info("registerForm001()");

        return "spring/thymeleaf/registerForm";
    }

    @GetMapping("/registerForm002")
    public String registerForm002(Model model) {
        log.info("registerForm002()");

        /* 모델은 데이터를 제어하는 객체라고 설명했었음
           스프링에서 활용할 수 있는 데이터 속성 이름으로 TestMember를 만들었음
           또한 이 TestMember 속성은 new TestMember()에 의해 생성된 객체를 가짐 */
        model.addAttribute("testMember", new TestMember());

        return "spring/thyme/registerForm";
    }

    @PostMapping("/register")
    public String doRegister(TestMember testMember) {
        log.info("doRegister()");
        log.info("userId = " + testMember.getUserName());
        log.info("passwd = " + testMember.getPassword());

        return "spring/thyme/result.html";
    }
}
