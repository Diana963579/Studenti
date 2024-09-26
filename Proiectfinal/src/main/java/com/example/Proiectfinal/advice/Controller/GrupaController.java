package com.example.Proiectfinal.advice.Controller;

import com.example.Proiectfinal.entity.Grup;
import com.example.Proiectfinal.service.GroupService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

    @RestController
    @RequestMapping("/api/grupe")
    public class GrupaController {

        @Autowired
        private GroupService grupService;

        // Adăugare grup
        @PostMapping("/adauga")
        public Grup addGrup(@RequestBody Grup grup) {
            return grupService.saveGrup(grup);
        }

        // Găsire toate grupele
        @GetMapping("/toate")
        public List<Grup> getAllGrupe() {
            return grupService.getAllGrupe();
        }

        // Găsire grup după ID
        @GetMapping("/{id}")
        public ResponseEntity<Grup> getGrupById(@PathVariable Long id) {
            Grup grup = grupService.getGrupById(id);
            return ResponseEntity.ok(grup);
        }

        // Ștergere grup după ID
        @DeleteMapping("/sterge/{id}")
        public ResponseEntity<Void> deleteGrupById(@PathVariable Long id) {
            grupService.deleteGrupById(id);
            return ResponseEntity.noContent().build();
        }
    }