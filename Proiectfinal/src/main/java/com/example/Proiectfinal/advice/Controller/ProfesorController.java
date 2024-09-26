package com.example.Proiectfinal.advice.Controller;

import com.example.Proiectfinal.entity.Profesor;
import com.example.Proiectfinal.service.TeacherService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

    @RestController
    @RequestMapping("/api/profesori")
    public class ProfesorController {

        @Autowired
        private TeacherService profesorService;

        // Adăugare profesor
        @PostMapping("/adauga")
        public Profesor addProfesor(@RequestBody Profesor profesor) {
            return profesorService.saveProfesor(profesor);
        }

        // Găsire toți profesorii
        @GetMapping("/toate")
        public List<Profesor> getAllProfesori() {
            return profesorService.getAllProfesori();
        }

        // Găsire profesor după ID
        @GetMapping("/{id}")
        public ResponseEntity<Profesor> getProfesorById(@PathVariable Long id) {
            Profesor profesor = profesorService.getProfesorById(id);
            return ResponseEntity.ok(profesor);
        }
    }