package com.example.Control2TBD.Models;

import jakarta.persistence.*;

@Entity
@Table(name = "usuario")
public class UsuarioModel {
    //ATRIBUTOS
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_usuario")
    private Long id;

    @Column(name = "nombre_usuario")
    private String nombre_usuario;

    @Column(name = "email")
    private String email;

    @Column(name = "password")
    private String password;

    //CONSTRUCTORES

    public UsuarioModel(){}

    public UsuarioModel(Long id, String nombre_usuario, String email, String password) {
        this.id = id;
        this.nombre_usuario = nombre_usuario;
        this.email = email;
        this.password = password;
    }

    //GETTER Y SETTERS

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNombre_usuario() {
        return nombre_usuario;
    }

    public void setNombre_usuario(String nombre_usuario) {
        this.nombre_usuario = nombre_usuario;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}
