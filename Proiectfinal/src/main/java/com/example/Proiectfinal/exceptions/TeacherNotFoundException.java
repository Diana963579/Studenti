package com.example.Proiectfinal.exceptions;

public class TeacherNotFoundException extends RuntimeException {
    public TeacherNotFoundException(String mesaj) {
        super(mesaj);
    }
}