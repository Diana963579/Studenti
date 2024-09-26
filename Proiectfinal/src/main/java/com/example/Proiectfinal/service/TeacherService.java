package com.example.Proiectfinal.service;

import com.example.Proiectfinal.entity.Profesor;
import com.example.Proiectfinal.exceptions.TeacherNotFoundException;
import com.example.Proiectfinal.repository.TeacherRepository;
import jakarta.persistence.Id;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TeacherService {

    private final TeacherRepository teacherRepository;

    public TeacherService(TeacherRepository teacherRepository) {
        this.teacherRepository = teacherRepository;
    }

    public Profesor gasesteProfesorDupaId(String Nume) {
        return TeacherRepository.findByNume(Nume)
                .orElseThrow(() -> new TeacherNotFoundException("Profesorul cu id-ul " + Nume + " nu a fost găsit"));
    }

    public Profesor saveProfesor(Profesor profesor) {
        return teacherRepository.save(profesor);
    }

    // Găsire toți profesorii
    public List<Profesor> getAllProfesori() {
        return teacherRepository.findAll();
    }

    // Găsire profesor după ID
    public Profesor getProfesorById(Long id) {
        return teacherRepository.findById(id)
                .orElseThrow(() -> new RuntimeException("Profesorul nu a fost găsit cu ID-ul: " + id));
    }
}