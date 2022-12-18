package com.sgp.crudproject.service;

import com.sgp.crudproject.domain.post.Post;
import com.sgp.crudproject.domain.post.PostRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
@RequiredArgsConstructor
public class PostService {

    private final PostRepository postRepository;

    public Post savePost(String title, String content) {
        Post newPost = Post.builder()
                .title(title)
                .content(content)
                .build();

        return postRepository.save(newPost);
    }

    public Post findPostById(long id) {
        Optional<Post> findPost = postRepository.findById(id);

        return findPost.orElse(null);
    }
}
