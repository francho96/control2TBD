package com.example.Control2TBD.Models;


public class UsuarioModel {
    //ATRIBUTOS

    private Integer id;
    private String nombre_usuario;
    private String email;
    private String password;
    //CONSTRUCTORES
    public UsuarioModel(){}

    public UsuarioModel(Integer id, String nombre_usuario, String email, String password) {
        this.id = id;
        this.nombre_usuario = nombre_usuario;
        this.email = email;
        this.password = password;
    }

    //GETTER Y SETTERS

    public Integer getId() {
        return id;
    }
    public void setId(Integer id) {
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
