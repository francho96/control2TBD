package com.example.Control2TBD.Services;

import com.example.Control2TBD.Models.UsuarioModel;
import com.example.Control2TBD.Repositories.UsuarioRepository;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@CrossOrigin
@RestController
public class UsuarioService {
    private final com.example.Control2TBD.Repositories.UsuarioRepository usuarioRepository;

    public UsuarioService(TareaRepository usuarioRepository) {
        this.usuarioRepository = usuarioRepository;
    }

    //create
    @PostMapping("/usuario")
    @ResponseBody
    public UsuarioModel create(@RequestBody UsuarioModel usuario) {
        return usuarioRepository.create(usuario);
    }

    //login
    @GetMapping("/usuario/login/{email}/{password}")
    public List<UsuarioModel> login(@PathVariable String email, @PathVariable String password){
        return usuarioRepository.login(email,password);
    }
}
