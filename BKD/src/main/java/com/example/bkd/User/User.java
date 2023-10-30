package com.example.bkd.User;
import com.fasterxml.jackson.annotation.JsonProperty;

public class User {
    @JsonProperty("id")
    private int id;
    @JsonProperty("nume")
    private String nume;
    @JsonProperty("age")
    private int age;

    public User() {
    }

    public User(int id, String nume, int age) {
        this.id = id;
        this.nume = nume;
        this.age = age;
    }

    public User(String nume, int age) {
        this.nume = nume;
        this.age = age;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNume() {
        return nume;
    }

    public void setNume(String nume) {
        this.nume = nume;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "User{" +
                "id=" + id +
                ", nume='" + nume + '\'' +
                ", age=" + age +
                '}';
    }
}
