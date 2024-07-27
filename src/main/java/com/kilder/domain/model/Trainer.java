package com.kilder.domain.model;

import jakarta.persistence.*;

import java.util.List;

@Entity(name = "tb_trainer")
public class Trainer {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    private String name;
    private String email;

    @OneToOne(cascade = CascadeType.ALL)
    private Dog dog;
    //private List<Dog> dogList;
    public Trainer(String name, String email, Dog dog) {
       // this.id = id;
        this.name = name;
        this.email = email;
        this.dog = dog;
    }
    // Getters and Setters
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

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public Dog getDog() {
        return dog;
    }

    public void setDog(Dog dog) {
        this.dog = dog;
    }

    @Override
    public String toString() {
        return "Trainer{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", email='" + email + '\'' +
                ", dog=" + dog +
                '}';
    }
}
