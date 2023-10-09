package com.example.Control2TBD.Models;




import java.util.Date;

public class TareaModel {

    //ATRIBUTOS
    private Integer id_tarea;
    private Integer id_usuario;

    private String titulo;
    private String descripcion;

    private Date fecha_vencimiento;
    private String estado;

    //CONSTRUCTOR
    public TareaModel(){}

    public TareaModel(Integer id_tarea, Integer id_usuario, String titulo, String descripcion, Date fecha_inicio, Date fecha_vencimiento, String estado) {
        this.id_tarea = id_tarea;
        this.id_usuario = id_usuario;
        this.titulo = titulo;
        this.descripcion = descripcion;
        this.fecha_vencimiento = fecha_vencimiento;
        this.estado = estado;
    }
//GETTERS Y SETTERS
    public Integer getId_tarea() {
    return id_tarea;
    }

    public void setId_tarea(Integer id_tarea) {
        this.id_tarea = id_tarea;
    }

    public Integer getId_usuario() {
        return id_usuario;
    }

    public void setId_usuario(Integer id_usuario) {
        this.id_usuario = id_usuario;
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
    

    public Date getFecha_vencimiento() {
        return fecha_vencimiento;
    }

    public void setFecha_vencimiento(Date fecha_vencimiento) {
        this.fecha_vencimiento = fecha_vencimiento;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }
}
