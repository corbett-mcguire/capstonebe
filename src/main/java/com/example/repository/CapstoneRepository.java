package com.example.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.example.model.Post;
import com.example.model.Type;
import org.springframework.stereotype.Repository;


import java.util.List;
import java.util.Optional;

@Repository
public interface CapstoneRepository extends JpaRepository<Type, Long> {
    List<Post> getPosts();

    Optional getPosts(Long postId);

    Post createPost(Post categoryObject);

    Post getPost(Long postId);

    Post updatePost(Long categoryId, Post categoryObject);

    List<Type> getTypes();

    Type getType(Long typeId);

    Type updateType(Long typeId, Type typeObject);

    Type createType(Type typeObject);

    Type deleteType(Long categoryId);

    Post createTypePost(Long typeId, Post recipeObject);

    Post getTypePosts();

    Post getTypePost(Long typeId, Long postId);

    List<Post> getTypePosts(Long typeId);

    Post updateTypePost(Long typeId, Long postId, Post postObject);

    Optional<Post> deleteTypePost(Long typeId, Long postId);
}
