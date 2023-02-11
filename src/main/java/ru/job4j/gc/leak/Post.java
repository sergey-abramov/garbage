package ru.job4j.gc.leak;

import java.util.List;

public class Post {

    private Integer id;

    private String text;

    private List<Comment> comments;

    public Post(String text, List<Comment> comments) {
        this.text = text;
        this.comments = comments;
    }

    public void setId(Integer id) {
        this.id = id;
    }
}
