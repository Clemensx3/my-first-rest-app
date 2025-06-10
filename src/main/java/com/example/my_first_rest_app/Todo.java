package com.example.my_first_rest_app;

import jakarta.persistence.*;

@Entity
public class Todo {

    //Integer id wird zu Primary key und wird automatisch generiert
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    private String description;
    private boolean isDone;

    @Column(nullable = false)
    private Integer userId;

    public void setId(Integer id) {
        this.id = id;
    }
    public Integer getId(){
        return this.id;
    }

    public void setDescription(String description) {
        this.description = description;
    }
    public String getDescription() {
        return this.description;
    }

    public void setIsDone(Boolean isDone) {
        this.isDone = isDone;
    }
    public Boolean getIsDone() {
        return this.isDone;
    }

    public void setUserId(Integer userId) {
        this.userId = userId;
    }
    public Integer getUserId() {
        return userId;
    }

}
