package com.example.repository;

import com.example.model.Post;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface CapstoneRepository extends Repository{
    List<Post> getPosts();
}
