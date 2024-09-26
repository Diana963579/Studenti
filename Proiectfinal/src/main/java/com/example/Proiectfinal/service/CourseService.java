package com.example.Proiectfinal.service;

import com.example.Proiectfinal.entity.Curs;
import com.example.Proiectfinal.entity.Grup;
import com.example.Proiectfinal.exceptions.CourseNotFoundException;
import com.example.Proiectfinal.repository.CourseRepository;
import com.example.Proiectfinal.repository.GroupRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CourseService {

    private final CourseRepository courseRepository;
    private final GroupRepository grupRepository;

    public CourseService(CourseRepository courseRepository, GroupRepository grupRepository) {
        this.courseRepository = courseRepository;
        this.grupRepository = grupRepository;
    }

    public Curs gasesteCursDupaId(Long id) {
        return courseRepository.findById(id)
                .orElseThrow(() -> new CourseNotFoundException("Cursul cu id-ul " + id + " nu a fost găsit"));
    }

    public List<Curs> gasesteCursuriDupaGrupId(Long grupId) {
        return courseRepository.findByGrupId(grupId);
    }

    public Curs saveCurs(Curs curs) {
        return courseRepository.save(curs);
    }

    public List<Curs> getAllCursuri() {
        return courseRepository.findAll();
    }

    // Găsire curs după ID
    public Curs getCursById(Long id) {
        return courseRepository.findById(id)
                .orElseThrow(() -> new RuntimeException("Cursul nu a fost găsit cu ID-ul: " + id));
    }

    // Ștergere curs după ID
    public void deleteCursById(Long id) {
        courseRepository.deleteById(id);
    }

}