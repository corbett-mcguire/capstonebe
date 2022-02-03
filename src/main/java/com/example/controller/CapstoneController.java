package com.example.controller;

import com.example.model.Post;
import com.example.model.Type;

import com.example.repository.CapstoneRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

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

    // http://localhost:9092/api/types
    @GetMapping("/types")
    public List<Type> getTypes() {
        System.out.println("calling getTypes method from controller");
        return capstoneRepository.getTypes();
    }

    // http://localhost:9092/api/types/1
    @GetMapping(path = "/types/{typeId}")
    public Type getType(@PathVariable Long typeId) {
        System.out.println("Calling getType ==>");
        return capstoneRepository.getType(typeId);
    }

    // http://localhost:9092/api/types
    @GetMapping(path = "/types")
    public Type createType(@RequestBody Type typeObject) {
        System.out.println("Calling createType ==>");
        return capstoneRepository.createType(typeObject);
    }

    // http://localhost:9092/api/types/1
    @PutMapping(path = "/types/{typeId}")
    public Type updateType(@PathVariable(value = "typeId") Long typeId, @RequestBody Type typeObject) {
        System.out.println("calling updateType method from controller");
        return capstoneRepository.updateType(typeId, typeObject);
    }

    // http://localhost:9092/api/types/10
    @DeleteMapping("/types/{typeId}")
    public Type deleteType(@PathVariable(value = "typeId") Long typeId) {
        System.out.println("calling deleteType method from controller");
        return capstoneRepository.deleteType(typeId);
    }

    // http://localhost:9092/api/types/10/posts
    @PostMapping(path = "types/{typeId}/posts")
    public Post createTypePost(
            @PathVariable(value = "typeId") Long typeId,
            @RequestBody Post postObject) {
        System.out.println("Calling createTypePost method from controller");
        return capstoneRepository.createTypePost(typeId, postObject);
    }
    // GET - All Posts by Type ID & Post ID
    // http://localhost:9092/api/types/10/posts/1
    @GetMapping("/types/{typeId}/posts/{postId}")
    public Post getType(
            @PathVariable(value = "typeId") Long typeId,
            @PathVariable(value = "postId") Long postId) {
        System.out.println("Calling getTypePost method from controller");
        return capstoneRepository.getTypePost(typeId, postId);
    }
    // GET - All posts by type ID
    // http://localhost:9092/api/types/10/posts
    @GetMapping("/types/{typeId}/posts")
    public List<Post> getTypePosts(@PathVariable(value = "typeId") Long typeId) {
        System.out.println("Calling getTypePosts method from controller");
        return capstoneRepository.getTypePosts(typeId);
    }
    // UPDATE - Post
    // http://localhost:9092/api/types/10/posts/1
    @PutMapping("/types/{typeId}/posts/{postId}")
    public Post updateTypePost(@PathVariable(value = "typeId") Long typeId,
                               @PathVariable(value = "postId") Long postId,
                               @RequestBody Post postObject) {
        System.out.println("Calling updateTypePost method from controller");
        return capstoneRepository.updateTypePost(typeId, postId, postObject);
    }
    // DELETE - Post
    // http://localhost:9092/api/types/10/posts/1
    @DeleteMapping("/types/{typeId}/posts/{postId}")
    public Optional<Post> deleteTypePost(@PathVariable(value = "typeId") Long typeId,
                                                 @PathVariable(value = "postId") Long postId) {
        System.out.println("Calling deleteCategoryRecipe method from controller");
        return capstoneRepository.deleteTypePost(typeId, postId);
    }
}