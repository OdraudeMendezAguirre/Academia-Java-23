import { HttpClient } from "@angular/common/http";
import { Observable } from "rxjs";
import { Injectable } from "@angular/core";
import { Alumno } from './entity/Alumno';

@Injectable({
    providedIn: 'root'
  })

export class AlumnosService{

    constructor(private http: HttpClient){}
    
    private url = 'http://localhost:8080/alumnos';

    getAlumnos():Observable<any>{
        return this.http.get(this.url);
    }

    saveAlumno(alumno:Alumno){
        return this.http.post(`${this.url}/add`,alumno)
    }

    updateAlumno(alumno:Alumno){
        return this.http.put(`${this.url}/update`,alumno)
    }

    deleteAlumno(id:number){
        return this.http.delete(`${this.url}/delete/${id}`)
    }
}