package com.example.demo.controller.data;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import java.text.DateFormat;
import java.util.Date;
import java.util.Locale;

@Controller
public class ModelTestController {
    private static final Logger log =
            LoggerFactory.getLogger(ModelTestController.class);

    @GetMapping("/modelDate")
    public String getModelDate(Locale locale, Model model) {
        /* Locale은 제일 중요한 정보가 로케일 셋이라고 해서
           문자 정보에 대한 내용을 가지고 있고
           보통 시간 정보를 조정하기 위해 이 정보를 함께 활용하는 편이다.
           UTC라는 국제 표준 시간이 있고
           우리는 실제 각각의 나라에 맞는 시간을 사용하기 때문
           Model은 Spring에서 제어하는 HTML 등등의 제어 데이터에 해당한다. */
        log.info("Client Locale: {}.", locale);

        /* 시간 정보 뿌리기 */
        Date date = new Date();
        DateFormat dateFormat = DateFormat.getDateTimeInstance(
                DateFormat.LONG, DateFormat.LONG, locale
        );

        /* 시간에 대한 정보를 문자열로 만들어서 Model에 있는 servTime에 맵핑 */
        String formattedDate = dateFormat.format(date);
        model.addAttribute("servTime", formattedDate);

        /* HTML로 View를 보여주는데 여기에 servTime이 있다면
           내용을 계승해서 보여줄 것임 */
        return "spring/model/modelDate.html";
    }
}
