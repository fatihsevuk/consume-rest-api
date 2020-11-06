package com.ifelseco.consumerestapi.controller;


import com.ifelseco.consumerestapi.model.Post;
import com.ifelseco.consumerestapi.service.PostService;
import org.springframework.web.bind.annotation.*;


@RestController
public class PostController {

    private PostService postService;

    public PostController(PostService postService) {
        this.postService = postService;
    }

    @GetMapping("/posts")
    public Post[] getPosts() {
        return postService.findAll();
    }


    @GetMapping("/posts/{id}")
    public Post getPost(@PathVariable int id) {
        return postService.findById(id);
    }

    @PostMapping("/posts")
    public Post savepost(@RequestBody Post post) {
        return postService.save(post);
    }
}
