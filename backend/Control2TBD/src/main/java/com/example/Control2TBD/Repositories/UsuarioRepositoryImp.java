package com.example.Control2TBD.Repositories;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.sql2o.Sql2o;

@Repository
public class UsuarioRepositoryImp implements UsuarioRepository {
    @Autowired
    private Sql2o sql2o;
}
