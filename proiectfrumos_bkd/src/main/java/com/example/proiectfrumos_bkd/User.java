package com.example.proiectfrumos_bkd;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonTypeId;
import jakarta.persistence.*;

@Entity
@Table(name = "users")
public class User {
    @Id
    @SequenceGenerator(
            name = "user_sequence",
            allocationSize = 1
    )
    @GeneratedValue(
            generator = "user_sequence",
            strategy = GenerationType.SEQUENCE
    )
    private int id;

    private String username;
    private String nume;
    private String prenume;
    private String email;
    private String parola;

    public User() {
    }

    public User(String username, String nume, String prenume, String email, String parola) {
        this.username = username;
        this.nume = nume;
        this.prenume = prenume;
        this.email = email;
        this.parola = parola;
    }

    public User(int id, String username, String nume, String prenume, String email, String parola) {
        this.id = id;
        this.username = username;
        this.nume = nume;
        this.prenume = prenume;
        this.email = email;
        this.parola = parola;
    }

    public long getId() {
        return id;
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

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
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
