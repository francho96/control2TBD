package com.example.Control2TBD.Models;


import jakarta.persistence.*;

@Entity
@Table(name = "tarea")
public class TareaModel {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_tarea")
    private Long id;
}
