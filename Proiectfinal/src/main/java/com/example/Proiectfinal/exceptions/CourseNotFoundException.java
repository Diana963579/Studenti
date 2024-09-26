package com.example.Proiectfinal.exceptions;

public class CourseNotFoundException extends RuntimeException {
    public CourseNotFoundException(String mesaj) {
        super(mesaj);
    }
}