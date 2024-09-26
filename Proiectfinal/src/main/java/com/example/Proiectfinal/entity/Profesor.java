package com.example.Proiectfinal.entity;

import jakarta.persistence.*;
import jakarta.persistence.*;
import java.util.List;
import java.util.List;

@Entity
public class Profesor {
        @Id
        @GeneratedValue(strategy = GenerationType.IDENTITY)
        private Long id;
        private String nume;
        private String prenume;
        private String titlu;
        private String materie;

        @OneToMany(mappedBy = "profesor", cascade = CascadeType.ALL)
        private List<Curs> cursuri;

        public Profesor(Long id, String nume, String materie, List<Curs> cursuri) {
            this.id = id;
            this.nume = nume;
            this.materie = materie;
            this.cursuri = cursuri;
            this.prenume = prenume;
            this.titlu = titlu;
        }

        public Profesor(String titlu) {
            this.titlu = titlu;
        }

        public Profesor() {

        }

        public Long getId() {
            return id;
        }

        public String getNume() {
            return nume;
        }

        public String getMaterie() {
            return materie;
        }

        public List<Curs> getCursuri() {
            return cursuri;
        }

        public void setId(Long id) {
            this.id = id;
        }

        public void setNume(String nume) {
            this.nume = nume;
        }

        public void setMaterie(String materie) {
            this.materie = materie;
        }

        public void setCursuri(List<Curs> cursuri) {
            this.cursuri = cursuri;
        }

        public String getPrenume() {
            return prenume;
        }

        public void setPrenume(String prenume) {
            this.prenume = prenume;
        }

        public String getTitlu() {
            return titlu;
        }

        public void setTitlu(String titlu) {
            this.titlu = titlu;
        }
    }