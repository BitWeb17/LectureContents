package com.example.board.entity.crawl;

import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Data
@NoArgsConstructor
@Entity
public class HomeNews {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long homeNewsSeq;

    @Column(length = 20, nullable = false)
    private String homeNewsNo;

    @Column(length = 20, nullable = false)
    private String image;

    @Column(length = 512, nullable = false)
    private String title;

    @Column(length = 1024, nullable = false)
    private String address;

    @Builder
    public HomeNews(String homeNewsNo, String image,
                String title, String address) {
        this.homeNewsNo = homeNewsNo;
        this.image = image;
        this.title = title;
        this.address = address;
    }
}
