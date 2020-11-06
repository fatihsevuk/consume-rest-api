package com.ifelseco.consumerestapi.service;

import com.ifelseco.consumerestapi.model.Config;
import com.ifelseco.consumerestapi.model.Post;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.hateoas.client.Traverson;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;


@Service
public class PostServiceImpl implements PostService {

    @Autowired
    private  RestTemplate restTemplate;

    @Autowired
    private Traverson traverson;


    @Override
    public Post findById(int id) {
        return restTemplate.getForObject(Config.baseUrl+"/posts/{id}",Post.class,id);
    }

    @Override
    public Post[] findAll() {
        ResponseEntity<Post[]> responseEntity = restTemplate.getForEntity(Config.baseUrl+"/posts", Post[].class);
        Post[] posts = responseEntity.getBody();
        return posts;
    }

    @Override
    public Post save(Post post) {
        return restTemplate.postForObject(Config.baseUrl+"/posts",post,Post.class);
    }

    @Override
    public void delete(Post post) {

    }
}
