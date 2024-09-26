package com.example.Proiectfinal.dto;

public class NoteDto {
    private Long id;
    private int valoare;
    private Long studentId;
    private Long cursId;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public int getValoare() {
        return valoare;
    }

    public void setValoare(int valoare) {
        this.valoare = valoare;
    }

    public Long getStudentId() {
        return studentId;
    }

    public void setStudentId(Long studentId) {
        this.studentId = studentId;
    }

    public Long getCursId() {
        return cursId;
    }

    public void setCursId(Long cursId) {
        this.cursId = cursId;
    }
}