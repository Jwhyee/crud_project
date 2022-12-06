package com.sgp.crudproject.web.controller;

import com.sgp.crudproject.domain.post.PostRepository;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

// Controller, Service, Repository, Entity
@Controller
@RequiredArgsConstructor
@Slf4j
public class PostController {

    private final PostRepository postRepository;

    @GetMapping("/post/new")
    public String showMainPage() {
        return "post/post-create";
    }

    @PostMapping("/post/new")
    public String createNewPost(String title, String content) {
        postRepository.savePost(title, content);

        postRepository.printPost();
        log.info("포스트 생성 메소드 호출");
        return "post/post-create";
    }

}
