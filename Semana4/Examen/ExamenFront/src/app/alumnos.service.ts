import { HttpClient } from "@angular/common/http";
import { Observable } from "rxjs";
import { Injectable } from "@angular/core";
import { Alumno } from './entity/Alumno';
import { LoginUsr } from './entity/LoginUsr';
import { map } from 'rxjs/operators';

@Injectable({
    providedIn: 'root'
  })

export class AlumnosService{

    constructor(private http: HttpClient){
        this.readToken();
    }
    
    private url = 'http://localhost:8080/alumnos';
    userToken ?: any;

    private readToken(){
        if ( localStorage.getItem('token')){
          this.userToken = localStorage.getItem('token');
        }else{
          this.userToken = "";
        }
      }

      private saveToken(token: any){
        this.userToken = token;
        localStorage.setItem('token', token)
      }

      //API REST METHODS

      Login(user:LoginUsr){
        const body= {
          usernameOrEmail: user.usernameOrEmail,
          password: user.password
        };
        
        return this.http.post(`${this.url}/iniciarSesion`, body)
        .pipe(map((resp:any)=>{
          console.log(resp);
          this.saveToken(resp['tokenDeAcceso']);
          return resp;
        }));
      }

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

    getAlumnoById(id:number):Observable<Alumno>{
        return this.http.get<Alumno>(`${this.url}/${id}`)
    }
}