package com.example.Proiectfinal.entity;

import jakarta.persistence.*;

@Entity
public class Nota {

        @Id
        @GeneratedValue(strategy = GenerationType.IDENTITY)
        private Long id;

        private int valoare;

        @ManyToOne
        @JoinColumn(name = "student_id")
        private Student student;

        @ManyToOne
        @JoinColumn(name = "curs_id")
        private Curs curs;

        public Nota(Long id, int valoare, Student student, Curs curs) {
            this.id = id;
            this.valoare = valoare;
            this.student = student;
            this.curs = curs;
        }

        public Nota(int valoare) {
            this.valoare = valoare;
        }

        public Nota() {

        }

        public Long getId() {
            return id;
        }

        public void setId(Long id) {
            this.id = id;
        }

        public int getValoare() {
            return valoare;
        }

        public void setValoare(int valoare) {
            this.valoare = valoare;
        }

        public Student getStudent() {
            return student;
        }

        public void setStudent(Student student) {
            this.student = student;
        }

        public Curs getCurs () {
            return curs;
        }

        public void setCurs (Curs curs) {
            this.curs = curs;
        }
    }