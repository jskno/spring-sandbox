package com.jskno.spring.sandbox.service;

import com.jskno.spring.sandbox.persistence.News;
import com.jskno.spring.sandbox.persistence.NewsRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class NewsService {

    private final NewsRepository newsRepository;

    private final String firstWord;

    private final String secondWord;

    private final String thirdWord;

    @Autowired
    public NewsService(NewsRepository newsRepository,
                       @Value("${app.first.word}")String firstWord,
                       @Value("${app.second.word}") String secondWord,
                       @Value("${app.third.word}") String thirdWord) {

        this.newsRepository = newsRepository;
        this.firstWord = firstWord;
        this.secondWord = secondWord;
        this.thirdWord = thirdWord;
    }

    public List<News> getAllNews() {
        return newsRepository.findAll();
    }
}
