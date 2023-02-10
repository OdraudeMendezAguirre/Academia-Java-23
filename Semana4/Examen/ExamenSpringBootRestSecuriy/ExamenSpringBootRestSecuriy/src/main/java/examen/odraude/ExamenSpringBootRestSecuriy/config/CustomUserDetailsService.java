/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package examen.odraude.ExamenSpringBootRestSecuriy.config;

import java.util.Collection;
import java.util.HashSet;
import java.util.Set;
import java.util.stream.Collectors;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import examen.odraude.ExamenSpringBootRestSecuriy.entity.Usuario;
import examen.odraude.ExamenSpringBootRestSecuriy.repository.UsuarioRepository;
/**
 *
 * @author odraude
 */
@Service
public class CustomUserDetailsService implements UserDetailsService {

    @Autowired
    private UsuarioRepository usuarioRepositorio;

    @Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
        Usuario usuario = usuarioRepositorio.findByUsernameOrEmail(username, username)
                .orElseThrow(() -> new UsernameNotFoundException("Usuario no encontrado con ese username o email : " + username));
        Set<String> rol = new HashSet<>();
        		rol.add(usuario.getRol());
        		
        return new User(usuario.getUsername(), usuario.getPassword(), mapearRoles(rol));
    }

    private Collection<? extends GrantedAuthority> mapearRoles(Set<String> roles) {
        return roles.stream().map(rol -> new SimpleGrantedAuthority(rol)).collect(Collectors.toList());
    }
}
