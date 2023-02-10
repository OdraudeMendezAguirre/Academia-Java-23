import { Component, OnInit } from '@angular/core';
import { Router } from '@angular/router';
import { LoginUsr } from '../entity/LoginUsr';
import { AlumnosService } from '../alumnos.service';
import { NgForm } from '@angular/forms';

@Component({
  selector: 'app-login',
  templateUrl: './login.component.html',
  styleUrls: ['./login.component.css']
})
export class LoginComponent implements OnInit{

  remenber = false;
  user:LoginUsr  = new LoginUsr();

  constructor(private router:Router, private api:AlumnosService) { }

  ngOnInit(): void {
    if(localStorage.getItem('usernameOrEmail') || localStorage.getItem('usernameOrEmail')){
      this.user.usernameOrEmail = JSON.stringify(localStorage.getItem('usernameOrEmail'));
      this.remenber = true;
    }
  }

  Login(form: NgForm){
  this.api.Login(this.user).subscribe(
    resp => {
       if(this.remenber){
        localStorage.setItem ('usernameOrEmail',JSON.stringify( this.user.usernameOrEmail));
         console.log(resp)}
       this.router.navigateByUrl('/crud')})}

}
