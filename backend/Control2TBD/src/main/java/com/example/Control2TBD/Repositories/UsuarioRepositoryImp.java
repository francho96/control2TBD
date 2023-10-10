package com.example.Control2TBD.Repositories;

import com.example.Control2TBD.Models.UsuarioModel;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.sql2o.Connection;
import org.sql2o.Sql2o;
import org.sql2o.Sql2oException;

import java.util.List;

@Repository
public class UsuarioRepositoryImp implements UsuarioRepository {
    @Autowired
    private Sql2o sql2o;

    @Override
    public UsuarioModel create(UsuarioModel usuario) {
        try (Connection conn = sql2o.open()) {
            String sql = "INSERT INTO usuario (id,nombre_usuario,email,password)" +
                    "VALUES (:id, :nombre_usuario, :email, :password)";
            conn.createQuery(sql, true)
                    .addParameter("id", usuario.getId())
                    .addParameter("nombre_usuario", usuario.getNombre_usuario())
                    .addParameter("email", usuario.getEmail())
                    .addParameter("password", usuario.getPassword())
                    .executeUpdate();
            return usuario;
        } catch (Exception e) {
            System.out.println(e.getMessage());
            return null;
        }
    }

    @Override
    public List<UsuarioModel> login(String email, String password){
        try(Connection conn = sql2o.open()) {
            return conn.createQuery("SELECT * FROM usuario WHERE email =:email AND password =:password")
                    .addParameter("email", email)
                    .addParameter("password", password)
                    .executeAndFetch(UsuarioModel.class);
        } catch (Exception exception){
            System.out.println(exception.getMessage());
            return null;
        }
    }




}
