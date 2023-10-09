package com.example.Control2TBD.Models;


import jakarta.persistence.*;

import java.util.Date;

@Entity
@Table(name = "tarea")
public class TareaModel {
    //ATRIBUTOS
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_tarea")
    private Long id;

    @Column(name = "titulo")
    private String titulo;

    @Column(name = "descripcion")
    private String descripcion;

    @Column(name = "fecha_incio")
    private Date fecha_inicio;

    @Column(name = "fecha_vencimiento")
    private Date fecha_vencimiento;

    /* Aca hay que decidir:
    * podríamos usar un bool, pero sería muy dicotómico
    * podríamos también tener ints que representen los estados
    * o también un String con el nombre del estado:
    * "tarea-asignada", "tarea-pendiente", etc; lo que estimen mejor*/
    @Column(name = "estado_tarea")
    private int estado;

    //CONSTRUCTOR
    public TareaModel(){}

    public TareaModel(Long id, String titulo, String descripcion, Date fecha_inicio, Date fecha_vencimiento, int estado) {
        this.id = id;
        this.titulo = titulo;
        this.descripcion = descripcion;
        this.fecha_inicio = fecha_inicio;
        this.fecha_vencimiento = fecha_vencimiento;
        this.estado = estado;
    }

    //GETTERS Y SETTERS

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public Date getFecha_inicio() {
        return fecha_inicio;
    }

    public void setFecha_inicio(Date fecha_inicio) {
        this.fecha_inicio = fecha_inicio;
    }

    public Date getFecha_vencimiento() {
        return fecha_vencimiento;
    }

    public void setFecha_vencimiento(Date fecha_vencimiento) {
        this.fecha_vencimiento = fecha_vencimiento;
    }

    public int getEstado() {
        return estado;
    }

    public void setEstado(int estado) {
        this.estado = estado;
    }
}
