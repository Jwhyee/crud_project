package com.sgp.crudproject;

import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;

// Repository -> 저장소
@Slf4j
@Repository
public class PostRepository {
    List<Post> postList = new ArrayList<>();
    int id = 0;

    public void savePost(String title, String content) {
        Post newPost = new Post(id++, title, content);
        postList.add(newPost);
    }

    public void printPost() {
        for (Post post : postList) {
            log.info("post title={}", post.getTitle());
            log.info("post content={}", post.getContent());
        }
    }

}
