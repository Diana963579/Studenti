package com.example.Proiectfinal.dto;

import com.example.Proiectfinal.enums.NivelStudiu;

public class StudentDto {

    private Long id;
    private String nume;
    private String prenume;
    private int age;
    private String nivelStudiu;
    private String numarMatricol;

    // Constructor fără parametri
    public StudentDto() {
    }

    // Constructor cu parametri
    public StudentDto(Long id, String nume, String prenume, int age, String nivelStudiu, String numarMatricol) {
        this.id = id;
        this.nume = nume;
        this.prenume = prenume;
        this.age = age;
        this.nivelStudiu = nivelStudiu;
        this.numarMatricol = numarMatricol;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
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
    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getNivelStudiu() {
        return nivelStudiu;
    }

    public void setNivelStudiu(String nivelStudiu) {
        this.nivelStudiu = nivelStudiu;
    }

    public String getNumarMatricol() {
        return numarMatricol;
    }

    public void setNumarMatricol(String numarMatricol) {
        this.numarMatricol = numarMatricol;
    }
}