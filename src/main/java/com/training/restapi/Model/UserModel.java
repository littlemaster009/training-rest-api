package com.training.restapi.Model;

import java.util.Date;

public class UserModel {

    private int userId;

    private String name;

    private String postId;

    private Date postDate;

    public UserModel(int userId, String name, String postId, Date postDate) {
        this.userId = userId;
        this.name = name;
        this.postId = postId;
        this.postDate = postDate;
    }

    protected UserModel() {
    }

    public int getUserId() {
        return userId;
    }

    public void setUserId(int userId) {
        this.userId = userId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPostId() {
        return postId;
    }

    public void setPostId(String postId) {
        this.postId = postId;
    }

    public Date getPostDate() {
        return postDate;
    }

    public void setPostDate(Date postDate) {
        this.postDate = postDate;
    }
}
