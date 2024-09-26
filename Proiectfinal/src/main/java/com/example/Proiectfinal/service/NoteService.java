package com.example.Proiectfinal.service;

import com.example.Proiectfinal.entity.Nota;
import com.example.Proiectfinal.exceptions.NoteNotFoundException;
import com.example.Proiectfinal.mappers.NoteMapper;
import com.example.Proiectfinal.repository.NoteRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;

@Service
public class NoteService {

    private final NoteRepository noteRepository;
    private final NoteMapper noteMapper;
    private final StudentService studentService;
    private final CourseService courseService;

    public NoteService(NoteRepository noteRepository, NoteMapper noteMapper, StudentService studentService, CourseService courseService) {
        this.noteRepository = noteRepository;
        this.noteMapper = noteMapper;
        this.studentService = studentService;
        this.courseService = courseService;
    }

    public Nota gasesteNotaDupaId(Long id) {
        return noteRepository.findById(id)
                .orElseThrow(() -> new NoteNotFoundException("Nota cu id-ul " + id + " nu a fost găsită"));
    }

    public List<Nota> gasesteToateNotele() {
        List<Nota> nota = noteRepository.findAll();
        if (nota.isEmpty()) {
            throw new NoteNotFoundException("Nu au fost găsite note.");
        }
        return nota;
    }

    // Alte metode CRUD, unde excepția poate fi aruncată
    public Nota adaugaNota(Nota nota) {
        return noteRepository.save(nota);
    }

    public void stergeNota(Long id) {
        Nota nota = gasesteNotaDupaId(id); // Dacă nu e găsită, se aruncă excepția
        noteRepository.delete(nota);
    }

    public NoteRepository getNoteRepository() {
        return noteRepository;
    }

    public List<Nota> getAllNote() {
        return noteRepository.findAll();
    }

    public Nota getNotaById(Long id) {
        return noteRepository.findById(id)
                .orElseThrow(() -> new RuntimeException("Nota nu a fost găsită cu ID-ul: " + id));
    }

    public void deleteNotaById(Long id) {
        noteRepository.deleteById(id);
    }

    public Nota saveNota(Nota nota) {
        return noteRepository.save(nota);
    }
}