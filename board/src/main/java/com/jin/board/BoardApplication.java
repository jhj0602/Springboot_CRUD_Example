package com.jin.board;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.data.jpa.repository.config.EnableJpaAuditing;
import org.springframework.web.filter.HiddenHttpMethodFilter;

@EnableJpaAuditing
@SpringBootApplication
public class BoardApplication {
    public static void main(String[] args) {
        SpringApplication.run(BoardApplication.class, args);
    }
    /**
     * HiddenHttpMethodFilter  
     * HiddenHttpMethodFilter 오류해결 구문
     * 오류페이지 문구
     * Whitelabel Error Page
     * This application has no configured error view, so you are seeing this as a fallback.
     *
     * Thu Feb 20 16:12:49 CST 2020
     * [baa9844c] There was an unexpected error (type=Method Not Allowed, status=405).
     * Request method 'POST' not supported
     */
    @Bean
    public HiddenHttpMethodFilter hiddenHttpMethodFilter(){
        HiddenHttpMethodFilter filter = new HiddenHttpMethodFilter();
        return filter;
    }
}