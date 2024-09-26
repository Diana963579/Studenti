package com.example.Proiectfinal.entity;

import jakarta.persistence.*;
import java.util.List;

@Entity
public class Grup {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long Id;
    private String NumeGrup;
    private String codGrupa;

    @OneToMany(mappedBy = "grup")
    private List<Student> students;

    public Grup(Long id, String codGrupa, List<Student> students, String numeGrup) {
        this.Id = Id;
        this.codGrupa = codGrupa;
        this.NumeGrup = numeGrup;
        this.students = students;

    }

    public Grup() {

    }

    public Long getId() {
        return Id;
    }

    public void setId(Long id) {
        this.Id = Id;
    }

    public String getCodGrupa() {
        return codGrupa;
    }

    public void setCodGrupa(String codGrupa) {
        this.codGrupa = codGrupa;
    }

    public List<Student> getStudents() {
        return students;
    }

    public void setStudents(List<Student> students) {
        this.students = students;
    }

    public String getNumeGrup() {
        return NumeGrup;
    }

    public void setNumeGrup(String numeGrup) {
        NumeGrup = numeGrup;
    }
}
