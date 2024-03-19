package com.transportejava.transporte.controllers;

import com.transportejava.transporte.dao.UsuarioDao;
import com.transportejava.transporte.models.Usuario;
import de.mkammerer.argon2.Argon2;
import de.mkammerer.argon2.Argon2Factory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.EnableTransactionManagement;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
public class UsuarioController {

    @Autowired
    private UsuarioDao usuarioDao;

    @RequestMapping(value = "api/usuarios/{id}", method = RequestMethod.GET)
    public Usuario getUsuario(@PathVariable Long id) {
        Usuario usuario = new Usuario();
        usuario.setId(id);
        usuario.setNombre("David");
        usuario.setApellido("Montilla");
        usuario.setEmail("jhonmontilla14@gmail.com");
        usuario.setTelefono("3003394453");
        usuario.setPassword("julian1");
        return usuario;
    }

    @RequestMapping(value = "api/usuarios", method = RequestMethod.GET)
    public List<Usuario> getUsuarios() {
       return usuarioDao.getUsuarios();
    }

    @RequestMapping(value = "api/usuarios", method = RequestMethod.POST)
    public void registrarUsuario(@RequestBody Usuario usuario) {
        usuarioDao.registrar(usuario);
    }

    @RequestMapping(value = "usuario/1")
    public Usuario editar() {
        Usuario usuario = new Usuario();
        usuario.setNombre("David");
        usuario.setApellido("Montilla");
        usuario.setEmail("jhonmontilla14@gmail.com");
        usuario.setTelefono("3003394453");
        usuario.setPassword("julian1");
        return usuario;
    }

    @RequestMapping(value = "api/usuarios/{id}", method = RequestMethod.DELETE)
    public void eliminar(@PathVariable Long id){
        usuarioDao.eliminar(id);
    }

    @RequestMapping(value = "usuario3")
    public Usuario buscar() {
        Usuario usuario = new Usuario();
        usuario.setNombre("David");
        usuario.setApellido("Montilla");
        usuario.setEmail("jhonmontilla14@gmail.com");
        usuario.setTelefono("3003394453");
        usuario.setPassword("julian1");
        return usuario;
    }
}
