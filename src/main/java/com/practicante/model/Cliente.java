package com.practicante.model;

import java.util.Date;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "clientes")
public class Cliente {

	@Id
	@Column(name = "id_cliente")
	private String id_cliente;
	
	@Column(name = "nombres")
	private String nombres;
	
	@Column(name = "apellidos")
	private String apellidos;
	
	@Column(name = "nro_documentos")
	private String nro_documentos;
	
	@Column(name = "email")
	private String email;
	
	@Column(name = "create_at")
	private Date create_at;
	

	public Cliente(String id_cliente, String nombres, String apellidos, String nro_documentos, String email,
			Date create_at) {
		super();
		this.id_cliente = id_cliente;
		this.nombres = nombres;
		this.apellidos = apellidos;
		this.nro_documentos = nro_documentos;
		this.email = email;
		this.create_at = create_at;
	}


	public String getId_cliente() {
		return id_cliente;
	}


	public void setId_cliente(String id_cliente) {
		this.id_cliente = id_cliente;
	}


	public String getNombres() {
		return nombres;
	}


	public void setNombres(String nombres) {
		this.nombres = nombres;
	}


	public String getApellidos() {
		return apellidos;
	}


	public void setApellidos(String apellidos) {
		this.apellidos = apellidos;
	}


	public String getNro_documentos() {
		return nro_documentos;
	}


	public void setNro_documentos(String nro_documentos) {
		this.nro_documentos = nro_documentos;
	}


	public String getEmail() {
		return email;
	}


	public void setEmail(String email) {
		this.email = email;
	}


	public Date getCreate_at() {
		return create_at;
	}


	public void setCreate_at(Date create_at) {
		this.create_at = create_at;
	}
	
	
	
}
