package com.practicante.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "productos")
public class Producto {

	@Id
	@Column(name = "id_producto")
	private String id_producto;
	
	@Column(name = "descripcion")
	private String descripcion;
	
	@Column(name = "cantidad")
	private Integer cantidad;
	
	@Column(name = "estado")
	private String estado;
	
	public Producto(String id_producto, String descripcion, Integer cantidad, String estado) {
		super();
		this.id_producto = id_producto;
		this.descripcion = descripcion;
		this.cantidad = cantidad;
		this.estado = estado;
	}
	public String getId_producto() {
		return id_producto;
	}
	public void setId_producto(String id_producto) {
		this.id_producto = id_producto;
	}
	public String getDescripcion() {
		return descripcion;
	}
	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}
	public Integer getCantidad() {
		return cantidad;
	}
	public void setCantidad(Integer cantidad) {
		this.cantidad = cantidad;
	}
	public String getEstado() {
		return estado;
	}
	public void setEstado(String estado) {
		this.estado = estado;
	}
	
	
}
