package ar.edu.unlam.t4p.model;

import java.util.List;

public class User {

    private Long id;
    private String username;
    private String password;
    private String fullName;
    private String description;

    private List<User> followers;
    private List<User> following;

    public Long getId() {
        return id;
    }
    public void setId(Long id) {
        this.id = id;
    }
    public String getUsername() {
        return username;
    }
    public void setUsername(String username) {
        this.username = username;
    }
    public String getPassword() {
        return password;
    }
    public void setPassword(String password) {
        this.password = password;
    }
    public String getFullName() {
        return fullName;
    }
    public void setFullName(String fullName) {
        this.fullName = fullName;
    }
    public String getDescription() {
        return description;
    }
    public void setDescription(String description) {
        this.description = description;
    }
    public List<User> getFollowers() {
        return followers;
    }
    public void setFollowers(List<User> followers) {
        this.followers = followers;
    }
    public List<User> getFollowing() {
        return following;
    }
    public void setFollowing(List<User> following) {
        this.following = following;
    }
    public boolean addFollower(User e) {
        if (!followers.contains(e)) {
            followers.add(e);
            e.addFollowing(this);
            return true;
        }
        return false;
    }
    public boolean addFollowing(User e) {
        if (!following.contains(e)) {
            following.add(e);
            e.addFollower(this);
            return true;
        }
        return false;
    }
}