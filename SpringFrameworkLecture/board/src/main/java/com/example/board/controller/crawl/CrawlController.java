package com.example.board.controller.crawl;

import com.example.board.entity.crawl.HomeNews;
import com.example.board.entity.crawl.News;
import com.example.board.service.crawl.NewsCrawlService;
import lombok.extern.java.Log;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@Log
@RestController
@CrossOrigin(origins = "http://localhost:8080", allowedHeaders = "*")
public class CrawlController {

    @Autowired
    NewsCrawlService newsCrawler;

    @GetMapping("/{category}")
    public List<News> crawling(@PathVariable String category) throws Exception {
        log.info("crawling(): " + category);

        newsCrawler.mainCrawler(category);

        return newsCrawler.newsFindAll();
    }

    @GetMapping("/news")
    public List<HomeNews> findHome() throws Exception {
        log.info("findHome()");

        newsCrawler.crawlingHome();

        return newsCrawler.homeNewsFindAll();
    }

    /*
    @GetMapping("/news/{newsNo}")
    public ClickedNews crawlingOne(@PathVariable String newsNo) {
        log.info("crawlingOne(): " + newsNo);

        return newsCrawler.crawlingOne(newsNo);
    }
     */
}
