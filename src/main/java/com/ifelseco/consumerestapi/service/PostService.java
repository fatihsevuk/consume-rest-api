package com.ifelseco.consumerestapi.service;

import com.ifelseco.consumerestapi.model.Post;
import com.ifelseco.consumerestapi.model.PostList;
import org.springframework.stereotype.Service;

import java.util.List;

public interface PostService {

    Post findById(int id);
    Post[] findAll();
    Post save(Post post);
    void delete(Post post);
}
