package com.example.Control2TBD.Repositories;

import com.example.Control2TBD.Models.UsuarioModel;
import java.util.List;

public interface UsuarioRepository {
    public UsuarioModel create(UsarioModel usuario);
    public List<UsuarioModel> login(String email, String password);
}
