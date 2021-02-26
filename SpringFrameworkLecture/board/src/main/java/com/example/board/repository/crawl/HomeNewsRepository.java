package com.example.board.repository.crawl;

import com.example.board.entity.crawl.HomeNews;
import org.springframework.data.jpa.repository.JpaRepository;

public interface HomeNewsRepository extends JpaRepository<HomeNews, Long> {
}
