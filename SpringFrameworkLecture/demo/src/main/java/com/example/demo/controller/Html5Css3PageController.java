package com.example.demo.controller;

import com.example.demo.game.DiceGame;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

// 결국 Event Handler에 해당한다.
// 몰컴하다 부모님이 뜨면 자는척 하다가 다시 게임하기 등등
@Controller
public class Html5Css3PageController {
    public static Logger log =
            LoggerFactory.getLogger(Html5Css3PageController.class);

    // 결국 Controller 입장에서의 Event는 무엇인가 ?
    // 사용자가 Web 서버에 URL 요청을 하는 것이다.
    @GetMapping("/first")
    public String getFirst() {
        log.info("Enter getFirst()");

        log.info("여기에 서비스 요청하는 코드를 작성한다.");

        log.info("요청을 처리하고 받아온 결과에 대해 " +
                "어떤 html 파일이 이를 출력할지 작성한다.");

        return "html_css/success.html";
    }

    @GetMapping("/ul_li")
    public String getUlLi() {
        log.info("Enter getUlLi()");

        return "html_css/ul_li.html";
    }

    @GetMapping("/ol_li")
    public String getOlLi() {
        log.info("Enter getOlLi()");

        return "html_css/ol_li.html";
    }

    @GetMapping("/img_test")
    public String getImg() {
        log.info("Enter getImg()");

        return "html_css/img_test.html";
    }

    @GetMapping("/p_test")
    public String getPTag() {
        log.info("Enter getPTag()");

        return "html_css/p_test.html";
    }

    @GetMapping("/blockquote_test")
    public String getBlockquote() {
        log.info("Enter getBlockquote()");

        return "html_css/blockquote_test.html";
    }

    @GetMapping("/pre_test")
    public String getPre() {
        log.info("Enter getPre()");

        return "html_css/pre_test.html";
    }

    @GetMapping("/style_page_test")
    public String getStylingTestPage() {
        log.info("Enter getStylingTestPage()");

        return "html_css/style_page_test.html";
    }

    @GetMapping("/p_options_test")
    public String getPOptionsTest() {
        log.info("Enter getPOptionsTest()");

        return "html_css/p_options_test.html";
    }

    @GetMapping("/mark_test")
    public String getMarkTest() {
        log.info("Enter getMarkTest()");

        return "html_css/mark_test.html";
    }

    @GetMapping("/span_color_test")
    public String getSpanColorTest() {
        log.info("Enter getSpanColorTest()");

        return "html_css/span_color_test.html";
    }

    @GetMapping("/ul_ol_li_test")
    public String getUlOlLiTest() {
        log.info("Enter getUlOlLiTest()");

        return "html_css/ul_ol_li_test.html";
    }

    @GetMapping("/ul_ul_li_test")
    public String getUlUlLiTest() {
        log.info("Enter getUlUlLiTest()");

        return "html_css/ul_ul_li_test.html";
    }

    // 컨트롤러에 새로운 맵핑을 만들어서
    // 사용자가 URL 요청을 하면
    // 주사위 게임이 동작하게 만들어보자!
    // 웹 페이지 출력은 Success로
    // 위에서 만들었던 "html_css/success.html" 를 활용한다.
    // 아직 게임 결과를 출력할 수 없으니
    // 콘솔창에 게임 결과를 출력하도록 한다.
    @GetMapping("/diceGame")
    public String getDiceGame() {
        log.info("Enter getDiceGame()");

        DiceGame dg = new DiceGame();
        dg.printWinner();

        return "html_css/success.html";
    }
}
