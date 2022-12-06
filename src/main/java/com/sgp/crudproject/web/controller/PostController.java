package com.sgp.crudproject.web.controller;

import com.sgp.crudproject.service.PostService;
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

    private final PostService postService;

    @GetMapping("/post/new")
    public String showMainPage() {
        return "post/post-create";
    }

    @PostMapping("/post/new")
    public String createNewPost(String title, String content) {
        postService.savePost(title, content);
        return "post/post-create";
    }

}
