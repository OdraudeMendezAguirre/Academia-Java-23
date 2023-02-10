import { NgModule } from '@angular/core';
import { BrowserModule } from '@angular/platform-browser';

import { AppRoutingModule } from './app-routing.module';
import { AppComponent } from './app.component';

import { HttpClientModule } from '@angular/common/http';
import { FormsModule } from '@angular/forms';

import { AlumnosService } from './alumnos.service';
import { LoginComponent } from './login/login.component';
import { CrudComponent } from './crud/crud.component';

@NgModule({
  declarations: [
    AppComponent,
    LoginComponent,
    CrudComponent
  ],
  imports: [
    BrowserModule,
    AppRoutingModule,
    HttpClientModule,
    FormsModule
  ],
  providers: [AlumnosService],
  bootstrap: [AppComponent]
})
export class AppModule { }
