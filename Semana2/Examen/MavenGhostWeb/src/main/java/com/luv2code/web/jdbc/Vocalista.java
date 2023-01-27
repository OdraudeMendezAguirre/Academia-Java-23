package com.luv2code.web.jdbc;

public class Vocalista {

	private int idVocalista;
	private String nombre;

	public Vocalista(String nombre) {
		this.nombre = nombre;
	}

	public Vocalista(int idVocalista, String nombre) {
		this.idVocalista = idVocalista;
		this.nombre = nombre;

	}

	public int getIdVocalista() {
		return idVocalista;
	}

	public void setIdVocalista(int id) {
		this.idVocalista = id;
	}

	public String getNombre() {
		return nombre;
	}

	public void setFirstName(String nombre) {
		this.nombre = nombre;
	}


	@Override
	public String toString() {
		return "Student [id=" + idVocalista + ", nombre=" + nombre + "]";
	}	
}
