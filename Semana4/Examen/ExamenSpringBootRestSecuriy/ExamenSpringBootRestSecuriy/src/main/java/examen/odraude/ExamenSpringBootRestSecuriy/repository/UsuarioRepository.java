/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package examen.odraude.ExamenSpringBootRestSecuriy.repository;

import java.util.Optional;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import examen.odraude.ExamenSpringBootRestSecuriy.entity.Usuario;

/**
 *
 * @author odraude
 */
@Repository
public interface UsuarioRepository extends JpaRepository<Usuario, Integer>{
    public Optional<Usuario> findByEmail(String email);
	
    public Optional<Usuario> findByUsernameOrEmail(String username,String email);

    public Optional<Usuario> findByUsername(String username);

    public Boolean existsByUsername(String username);

    public Boolean existsByEmail(String email);
}
