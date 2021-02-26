package com.example.board.repository.crawl;

import com.example.board.entity.crawl.News;
import org.springframework.data.jpa.repository.JpaRepository;

public interface NewsRepository extends JpaRepository<News, Long> {
    public News findByNewsNo(String newsNo);
}
