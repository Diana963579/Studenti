package com.example.Proiectfinal.advice;

import com.example.Proiectfinal.entity.Student;


public class Main {
    public static void main(String[] args) {
        // Creeare un obiect Student
        Student student = new Student(1L, "Maria", "Ionescu", 21, "MASTER","CIG");

        // Afișare detaliile studentului
        System.out.println("ID: " + student.getId());
        System.out.println("Nume: " + student.getNume());
        System.out.println("Prenume: " + student.getPrenume());
        System.out.println("Age: " + student.getAge());
        System.out.println("Nivel de studiu: " + student.getNivelStudiu());
        System.out.println("Numar matricol: " + student.getNumarMatricol());
    }
}