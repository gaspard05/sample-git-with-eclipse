package com.indevopslab.samplegit.model;

public class Course {
    private int id;
    private String name;
    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    @Override
    public String toString() {
        return String.format("Course [id=%s, name=%s]", id, name);
    }   
}
