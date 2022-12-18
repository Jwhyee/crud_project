package com.sgp.crudproject.web.controller;

import com.sgp.crudproject.domain.post.Post;
import com.sgp.crudproject.service.PostService;
import com.sgp.crudproject.web.dto.PostDto;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import java.util.List;

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
    public String createPost(PostDto postDto, RedirectAttributes redirectAttributes) {
        Post newPost = postService.savePost(postDto);
        redirectAttributes.addAttribute("id", newPost.getId());
        return "redirect:/post/{id}";
    }

    @GetMapping("/post/{id}")
    public String detailPost(@PathVariable long id, Model model) {
        Post currentPost = postService.findPostById(id);
        if (currentPost == null) return "main/error";
        model.addAttribute("post", currentPost);
        return "post/post-detail";
    }

    @GetMapping("/posts")
    public String showPostList(Model model) {
        List<Post> postList = postService.findPosts();
        model.addAttribute("posts", postList);
        return "post/post-list";
    }
}
