package com.example.Proiectfinal.mappers;

import com.example.Proiectfinal.dto.NoteDto;
import com.example.Proiectfinal.entity.Curs;
import com.example.Proiectfinal.entity.Nota;
import com.example.Proiectfinal.entity.Student;
import org.springframework.stereotype.Component;

@Component
public class NoteMapper {

    public NoteDto toDto(Nota nota) {
        NoteDto dto = new NoteDto();
        dto.setId(nota.getId());
        dto.setValoare(nota.getValoare());
        dto.setStudentId(nota.getStudent().getId());
        dto.setCursId(nota.getCurs().getId());
        return dto;
    }

    public Nota toEntity(NoteDto dto, Student student, Curs curs) {
        Nota nota = new Nota();
        nota.setId(dto.getId());
        nota.setValoare(dto.getValoare());
        nota.setStudent(student);
        nota.setCurs(curs);
        return nota;
    }
}