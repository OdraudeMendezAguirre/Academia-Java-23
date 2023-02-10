package examen.odraude.ExamenSpringBootRestSecuriy.controller;

import java.util.Collections;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.security.core.Authentication;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.security.crypto.password.PasswordEncoder;

import examen.odraude.ExamenSpringBootRestSecuriy.config.JWTAuthResonseDTO;
import examen.odraude.ExamenSpringBootRestSecuriy.config.JwtTokenProvider;
import examen.odraude.ExamenSpringBootRestSecuriy.dto.LoginDTO;
import examen.odraude.ExamenSpringBootRestSecuriy.entity.Alumno;
import examen.odraude.ExamenSpringBootRestSecuriy.entity.Usuario;
import examen.odraude.ExamenSpringBootRestSecuriy.repository.AlumnoRepository;
import examen.odraude.ExamenSpringBootRestSecuriy.repository.UsuarioRepository;

@RestController
@RequestMapping("/alumnos")
public class AlumnoController {
	
    @Autowired
    private AuthenticationManager authenticationManager; 
    
	@Autowired
	AlumnoRepository repo;
	
	@Autowired
	UsuarioRepository urepo;
	
    @Autowired
    private PasswordEncoder passwordEncoder;
	
    
    @Autowired
    private JwtTokenProvider jwtTokenProvider;
	
    @CrossOrigin(origins = "*")
	@GetMapping()
	public List<Alumno> getAlumnos(){
		return repo.findAll();
	}
	
	@CrossOrigin(origins = "*")
	@PostMapping("/add")
	public Alumno addAlumno(@RequestBody Alumno alumno) {
		return repo.save(alumno);
	}
	
	@CrossOrigin(origins = "*")
	@PutMapping("/update")
	public Alumno updateAlumno(@RequestBody Alumno alumno) {
		return repo.save(alumno);
	}
	
	@CrossOrigin(origins = "*")
	@GetMapping("/{id}")
	public Alumno getOneAlumno(@PathVariable int id) {
		Alumno alumno = repo.findById(id).get();
		if (alumno == null) {
			throw new AlumnoNotFoundException("Customer id not found - " + id);
		}
		return alumno ;
	}
	
	@CrossOrigin(origins = "*")
	@DeleteMapping("/delete/{id}")
	public void delete(@PathVariable int id) {
		Alumno alumno = repo.findById(id).get();
		if (alumno == null) {
			throw new AlumnoNotFoundException("Customer id not found - " + id);
		}
		repo.deleteById(alumno.getId());
	}
	
    @CrossOrigin(origins = "*")
    @PostMapping("/iniciarSesion")
    public ResponseEntity<JWTAuthResonseDTO> authenticateUser(@RequestBody LoginDTO loginDTO) {
        Authentication authentication = authenticationManager.authenticate(new UsernamePasswordAuthenticationToken(loginDTO.getUsernameOrEmail(), loginDTO.getPassword()));

        SecurityContextHolder.getContext().setAuthentication(authentication);

        //obtenemos el token del jwtTokenProvider
        String token = jwtTokenProvider.generarToken(authentication);

        return ResponseEntity.ok(new JWTAuthResonseDTO(token));
    }
	
    @CrossOrigin(origins = "*")
    @PostMapping("/registrar")
    public Usuario registrarUsuario(@RequestBody Usuario usuario) {
        if (urepo.existsByEmail(usuario.getEmail())) {
            return null;
        }
        //Rol roles = rolRepositorio.findByNombre("ROLE_USER").get();
        usuario.setPassword(passwordEncoder.encode(usuario.getPassword()));
        return urepo.save(usuario);
    }
}
