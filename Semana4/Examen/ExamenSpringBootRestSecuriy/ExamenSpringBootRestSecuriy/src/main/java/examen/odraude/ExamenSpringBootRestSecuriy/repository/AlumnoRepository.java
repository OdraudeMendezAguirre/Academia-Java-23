package examen.odraude.ExamenSpringBootRestSecuriy.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import examen.odraude.ExamenSpringBootRestSecuriy.entity.Alumno;

@Repository
public interface AlumnoRepository extends JpaRepository<Alumno, Integer> {

}
