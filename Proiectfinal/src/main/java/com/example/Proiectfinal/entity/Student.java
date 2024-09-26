package com.example.Proiectfinal.entity;

import jakarta.persistence.*;

@Entity
public class Student {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String nume;
    private String prenume;
    private int age;
    private String nivelStudiu;
    private String numarMatricol;

    @ManyToOne
    @JoinColumn(name = "grupId")
    private Grup grup;

    public Student(Long id, String nume, String prenume, int age, String nivelStudiu, String numarMatricol) {
        this.nume = nume;
        this.prenume = prenume;
        this.age = age;
        this.nivelStudiu = nivelStudiu;
        this.numarMatricol = numarMatricol;
    }

    public Student() {
    }

    public Long getId() {
        return id;
    }

    public String getNume() {
        return nume;
    }

    public String getPrenume() {
        return prenume;
    }

    public int getAge() {
        return age;
    }

    public String getNivelStudiu() {
        return nivelStudiu;
    }

    public String getNumarMatricol() {
        return numarMatricol;
    }

    public void setNume(String nume) {
        this.nume = nume;
    }

    public void setPrenume(String prenume) {
        this.prenume = prenume;
    }

    public void setNumarMatricol(String numarMatricol) {
        this.numarMatricol = numarMatricol;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public void setNivelStudiu(String nivelStudiu) {
        this.nivelStudiu = nivelStudiu;
    }
}
