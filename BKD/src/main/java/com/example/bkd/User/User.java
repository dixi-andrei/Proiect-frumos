package com.example.bkd.User;
import com.fasterxml.jackson.annotation.JsonProperty;

public class User {

    private int id;
    private String nume;
    private String prenume;
    private String email;
    private String parola;

    public User() {
    }

    public User(int id, String nume, String prenume, String email, String parola) {
        this.id = id;
        this.nume = nume;
        this.prenume = prenume;
        this.email = email;
        this.parola = parola;
    }

    public User(String nume, String prenume, String email, String parola) {
        this.nume = nume;
        this.prenume = prenume;
        this.email = email;
        this.parola = parola;
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

    public String getPrenume() {
        return prenume;
    }

    public void setPrenume(String prenume) {
        this.prenume = prenume;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getParola() {
        return parola;
    }

    public void setParola(String parola) {
        this.parola = parola;
    }

    @Override
    public String toString() {
        return "User{" +
                "id=" + id +
                ", nume='" + nume + '\'' +
                ", prenume='" + prenume + '\'' +
                ", email='" + email + '\'' +
                ", parola='" + parola + '\'' +
                '}';
    }
}
