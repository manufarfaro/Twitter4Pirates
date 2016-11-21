package ar.edu.unlam.t4p.model;

import java.util.Date;
import java.util.List;

public class Tweet {
    private Long id;
    private String text;
    private Date timestamp;
    private Tweet previous;
    private User author;
    private List<User> mentions;
    public Long getId() {
        return id;
    }
    public void setId(Long id) {
        this.id = id;
    }
    public String getText() {
        return text;
    }
    public void setText(String text) {
        this.text = text;
    }
    public Date getTimestamp() {
        return timestamp;
    }
    public void setTimestamp(Date timestamp) {
        this.timestamp = timestamp;
    }
    public Tweet getPrevious() {
        return previous;
    }
    public void setPrevious(Tweet previous) {
        this.previous = previous;
    }
    public User getAuthor() {
        return author;
    }
    public void setAuthor(User author) {
        this.author = author;
    }
    public List<User> getMentions() {
        return mentions;
    }
    public void setMentions(List<User> mentions) {
        this.mentions = mentions;
    }
    public boolean addMentions(User e) {
        return mentions.add(e);
    }

}