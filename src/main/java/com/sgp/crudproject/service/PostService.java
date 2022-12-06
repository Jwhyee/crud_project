package com.sgp.crudproject.service;

import com.sgp.crudproject.domain.post.Post;
import com.sgp.crudproject.domain.post.PostRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class PostService {
    private final PostRepository postRepository;

    public void savePost(String title, String content) {
        Post post = new Post();
        post.setTitle(title);
        post.setContent(content);

        postRepository.save(post);
    }
}
