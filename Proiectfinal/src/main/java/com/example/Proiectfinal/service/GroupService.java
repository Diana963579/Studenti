package com.example.Proiectfinal.service;

import com.example.Proiectfinal.entity.Grup;
import com.example.Proiectfinal.exceptions.GroupNotFoundException;
import com.example.Proiectfinal.repository.GroupRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class GroupService {

    private final GroupRepository groupRepository;

    public GroupService(GroupRepository grupRepository) {
        this.groupRepository = grupRepository;
    }

    public Grup gasesteGrupDupaId(Long id) {
        return groupRepository.findById(id)
                .orElseThrow(() -> new GroupNotFoundException("Grupul cu id-ul " + id + " nu a fost găsit"));
    }

    public Grup saveGrup(Grup grup) {
        return groupRepository.save(grup);
    }

    // Găsire toate grupele
    public List<Grup> getAllGrupe() {
        return groupRepository.findAll();
    }

    // Găsire grup după ID
    public Grup getGrupById(Long id) {
        return groupRepository.findById(id)
                .orElseThrow(() -> new RuntimeException("Grupa nu a fost găsită cu ID-ul: " + id));
    }

    // Ștergere grup după ID
    public void deleteGrupById(Long id) {
        groupRepository.deleteById(id);
    }
}