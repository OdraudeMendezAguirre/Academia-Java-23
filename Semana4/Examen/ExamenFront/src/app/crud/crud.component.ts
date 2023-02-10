import { Component, OnInit } from '@angular/core';
import { AlumnosService } from '../alumnos.service';
import { Alumno } from '../entity/Alumno';

@Component({
  selector: 'app-crud',
  templateUrl: './crud.component.html',
  styleUrls: ['./crud.component.css']
})
export class CrudComponent implements OnInit{
  lista: any[]=[];
  alumnoTemporal = new Alumno();
  id=0;
  constructor(private alumnoService: AlumnosService){}

  ngOnInit(): void {
    this.alumnoService.getAlumnos().subscribe(resp=>{
      this.lista = resp;
    }, error =>{console.error(error)})
  }
  
  setAlumno(alumno: Alumno){
    this.alumnoTemporal=alumno
  }
  select(alumno: Alumno){
    const ms = "id: " + alumno.id + " " + alumno.nombre + ": " + alumno.calificacion;
    window.alert(ms)
  }

  guardar(){
    this.alumnoService.saveAlumno(this.alumnoTemporal).subscribe(resp=>{
      this.alumnoTemporal = new Alumno();
      this.lista.push(resp);
    },error=>{console.error(error)})
  }

  eliminar(){
    this.alumnoService.deleteAlumno(this.alumnoTemporal.id).subscribe(resp=>{
      this.alumnoTemporal = new Alumno();
    })
  }

  modificar(){
    this.alumnoService.updateAlumno(this.alumnoTemporal).subscribe(resp=>{
      this.alumnoTemporal = new Alumno();
      this.lista.push(resp);
    },error=>{console.error(error)})
  }

  buscarId(id:number){
    this.alumnoService.getAlumnoById(id).subscribe(resp=>{
      this.alumnoTemporal=resp;
    })
  }

  cancelar(){
    this.alumnoTemporal=new Alumno()
  }
}
