package com.example.controller;

import com.example.repository.CapstoneRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.example.model.Post;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping(path = "/api")
public class CapstoneController {

        private CapstoneRepository capstoneRepository;

    @Autowired
    public void setCapstoneRepository(CapstoneRepository capstoneRepository) {
        this.capstoneRepository = capstoneRepository;
    }

    @GetMapping("/posts")
    public List<Post> getPosts() {
        System.out.println("calling getPosts ==>");
        return capstoneRepository.getPosts();
    }

    @GetMapping(path = "/posts/{postId}")
    public Optional getPost(@PathVariable Long postId) {
        System.out.println("Calling getPost ==>");
        Optional posts = CapstoneRepository.findById(postId);
        if (posts.isPresent()) {
            return posts;
        } else {
            throw new InformationNotFoundException("post with id " + categoryId + " not found");
        }

}