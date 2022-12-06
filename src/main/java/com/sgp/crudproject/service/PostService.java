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
        Post newPost = new Post();

        newPost.setTitle(title);
        newPost.setContent(content);

        postRepository.save(newPost);
    }

}
