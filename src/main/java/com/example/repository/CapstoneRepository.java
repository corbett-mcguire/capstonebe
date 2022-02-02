package com.example.repository;

import com.example.model.Post;
import com.example.model.Type;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public interface CapstoneRepository extends Repository{
    List<Post> getPosts();

    Optional getPosts(Long postId);

    Post createPost(Post categoryObject);

    Post getPost(Long postId);

    Post updatePost(Long categoryId, Post categoryObject);

    List<Type> getTypes();

    Type getType(Long typeId);

    Type updateType(Long typeId, Type typeObject);

    Type createType(Type typeObject);
}
