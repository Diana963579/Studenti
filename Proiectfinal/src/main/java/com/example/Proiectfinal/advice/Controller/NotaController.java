package com.example.Proiectfinal.advice.Controller;


import com.example.Proiectfinal.dto.NoteDto;
import com.example.Proiectfinal.entity.Curs;
import com.example.Proiectfinal.entity.Student;
import com.example.Proiectfinal.service.NoteService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import java.util.List;
import com.example.Proiectfinal.entity.Nota;

    @RestController
    @RequestMapping("/api/note")
    public class NotaController {

        private final NoteService notaService;

        public NotaController(NoteService notaService) {
            this.notaService = notaService;
        }

        // Adăugare notă
        @PostMapping("/adauga")
        public Nota addNota(@RequestBody Nota nota) {
            return notaService.saveNota(nota);
        }

        // Găsire toate notele
        @GetMapping("/toate")
        public List<Nota> getAllNote() {
            return notaService.getAllNote();
        }

        // Găsire notă după ID
        @GetMapping("/{id}")
        public ResponseEntity<Nota> getNotaById(@PathVariable Long id) {
            Nota nota = notaService.getNotaById(id);
            return ResponseEntity.ok(nota);
        }

        // Ștergere notă după ID
        @DeleteMapping("/sterge/{id}")
        public ResponseEntity<Void> deleteNotaById(@PathVariable Long id) {
            notaService.deleteNotaById(id);
            return ResponseEntity.noContent().build();
        }

    }