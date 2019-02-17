package com.indevopslab.samplegit.model;

public class User {
    
    private String name;
    private int age;

    public User() {
        super();
    }
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return String.format("User [name=%s, age=%s]", name, age);
    }    
    
    
}
