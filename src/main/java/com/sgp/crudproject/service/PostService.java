package com.sgp.crudproject.service;

import com.sgp.crudproject.domain.post.Post;
import com.sgp.crudproject.domain.post.PostRepository;
import com.sgp.crudproject.web.dto.PostDto;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
@RequiredArgsConstructor
public class PostService {

    private final PostRepository postRepository;
    private final ModelMapper modelMapper;

    public Post savePost(PostDto dto) {

        Post newPost = modelMapper.map(dto, Post.class);
        return postRepository.save(newPost);

    }

    public Post findPostById(long id) {
        Optional<Post> findPost = postRepository.findById(id);

        return findPost.orElse(null);
    }

    public List<Post> findPosts() {
        return postRepository.findAll();
    }
}
