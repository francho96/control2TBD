/*package com.example.Control2TBD.Jwt;

import com.example.Control2TBD.Models.UsuarioModel;
import com.example.Control2TBD.Repositories.UsuarioRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

@Service
public class CustomerDetailsService implements UserDetailsService{

    @Autowired
    private UsuarioRepository usuarioRepository;

    private UsuarioModel userDetail;


    @Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
        log.info("Dentro de loadUserByUsername {}, ", username);
        userDetail = usuarioRepository.findByUsername(username);
        return null;
    }
}*/