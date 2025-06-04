package com.example.my_first_rest_app;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Todo {

    //Integer id wird zu Primary key und wird automatisch generiert
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer id;

    private String description;
    private boolean isDone;

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

}
