package com.kilder.domain.model;


import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity(name = "tb_dog")
public class Dog {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private String dogName;
    private String breed;
    private int age;
    private String healthRecords;
    private String trainingHistory;

     public Dog(String dogName, String breed, int age, String healthRecords, String trainingHistory) {
        this.dogName = dogName;
        this.breed = breed;
        this.age = age;
        this.healthRecords = healthRecords;
        this.trainingHistory = trainingHistory;
    }

    // Getters and Setters
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getDogName() {
        return dogName;
    }

    public void setDogName(String dogName) {
        this.dogName = dogName;
    }

    public String getBreed() {
        return breed;
    }

    public void setBreed(String breed) {
        this.breed = breed;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getHealthRecords() {
        return healthRecords;
    }

    public void setHealthRecords(String healthRecords) {
        this.healthRecords = healthRecords;
    }

    public String getTrainingHistory() {
        return trainingHistory;
    }

    public void setTrainingHistory(String trainingHistory) {
        this.trainingHistory = trainingHistory;
    }

    @Override
    public String toString() {
        return "Dog{" +
                "dogName='" + dogName + '\'' +
                ", breed='" + breed + '\'' +
                ", age=" + age +
                ", healthRecords='" + healthRecords + '\'' +
                ", trainingHistory='" + trainingHistory + '\'' +
                '}';
    }
}
