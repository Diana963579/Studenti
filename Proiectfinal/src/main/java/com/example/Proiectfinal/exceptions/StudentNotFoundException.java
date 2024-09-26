package com.example.Proiectfinal.exceptions;

public class StudentNotFoundException extends RuntimeException {
    public StudentNotFoundException(String mesaj) {
        super(mesaj);
    }
}
