package com.example.model;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.example.repository.CapstoneRepository;

import javax.persistence.*;

@Entity
@Table(name = "posts")
public class Post {
    @Id
    @Column
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column
    private String name;

    @Column
    private String title;

    @Column
    private String description;

    @JsonIgnore
    @ManyToOne
    @JoinColumn(name = "type_id")
    private Type type;

    public Post() {
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    @Override
    public String toString() {
        return "Type{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", description='" + description + '\'' +
                ", title=" + title + '\'' +
                '}';
    }

    public Type getType() {
        return type;
    }

    public void setType(Type type) {
        this.type = type;
    }


}
