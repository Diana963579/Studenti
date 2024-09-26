package com.example.Proiectfinal.exceptions;

public class GroupNotFoundException extends RuntimeException {
    public GroupNotFoundException(String mesaj) {
        super(mesaj);
    }
}