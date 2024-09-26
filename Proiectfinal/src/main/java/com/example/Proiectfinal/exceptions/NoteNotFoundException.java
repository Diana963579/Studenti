package com.example.Proiectfinal.exceptions;

public class NoteNotFoundException extends RuntimeException {
    public NoteNotFoundException(String mesaj) {
        super(mesaj);
    }
}