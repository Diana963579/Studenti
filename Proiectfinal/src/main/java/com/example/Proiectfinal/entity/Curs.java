package com.example.Proiectfinal.entity;

import jakarta.persistence.*;
import java.util.List;
import java.util.Set;


    @Entity
    public class Curs {

        @Id
        @GeneratedValue(strategy = GenerationType.IDENTITY)
        private Long id;

        private String numeCurs;

        @ManyToOne
        @JoinColumn(name = "profesor_id")
        private Profesor profesor;

        @OneToMany(mappedBy = "curs", cascade = CascadeType.ALL)
        private Set<Nota> nota;

        @ManyToOne
        @JoinColumn(name = "grup_id")
        private Grup grup;

        public Grup getGrup() {
            return grup;
        }

        public Curs(Grup grup) {
            this.grup = grup;
        }

        public void setGrup(Grup grup) {
            this.grup = grup;
        }

        public Curs(Long id, String numeCurs, Profesor profesor, Set<Nota> nota) {
            this.id = id;
            this.numeCurs = numeCurs;
            this.profesor = profesor;
            this.nota = nota;
        }

        public Curs(Long id) {
            this.id = id;
        }

        public Curs() {

        }

        public Long getId() {
            return id;
        }

        public String getNumeCurs() {
            return numeCurs;
        }

        public Profesor getProfesor() {
            return profesor;
        }

        public Set<Nota> getNota() {
            return nota;
        }

        public void setId(Long id) {
            this.id = id;
        }

        public void setNumeCurs(String numeCurs) {
            this.numeCurs = numeCurs;
        }

        public void setProfesor(Profesor profesor) {
            this.profesor = profesor;
        }

        public void setNota(Set<Nota> nota) {
            this.nota = nota;
        }
    }