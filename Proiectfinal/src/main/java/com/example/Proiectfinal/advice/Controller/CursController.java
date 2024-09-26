package com.example.Proiectfinal.advice.Controller;

import com.example.Proiectfinal.service.CourseService;
import com.example.Proiectfinal.service.CourseService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import com.example.Proiectfinal.entity.Curs;
import java.util.List;

    @RestController
    @RequestMapping("/api/cursuri")
    public class CursController {

        @Autowired
        private CourseService cursService;

        // Adăugare curs
        @PostMapping("/adauga")
        public Curs addCurs(@RequestBody Curs curs) {
            return cursService.saveCurs(curs);
        }

        // Găsire toate cursurile
        @GetMapping("/toate")
        public List<Curs> getAllCursuri() {
            return cursService.getAllCursuri();
        }

        // Găsire curs după ID
        @GetMapping("/{id}")
        public ResponseEntity<Curs> getCursById(@PathVariable Long id) {
            Curs curs = cursService.getCursById(id);
            return ResponseEntity.ok(curs);
        }

        // Ștergere curs după ID
        @DeleteMapping("/sterge/{id}")
        public ResponseEntity<Void> deleteCursById(@PathVariable Long id) {
            cursService.deleteCursById(id);
            return ResponseEntity.noContent().build();
        }
    }