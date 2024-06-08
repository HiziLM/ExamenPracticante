package com.practicante.model;

import java.math.BigDecimal;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;

@Entity
@Table(name = "DetalleVentas")
public class DetalleVenta {

	@Id
	@Column(name = "id_detalle")
	private String id_detalle;
	
	@Column(name = "cantidad")
	private Integer cantidad;
	
	@Column(name = "precio")
	private BigDecimal precio;
	
	@Column(name = "sub_total")
	private BigDecimal sub_total;
	
	@ManyToOne
	@JoinColumn(name = "id_venta", referencedColumnName = "id_venta")
	private Venta venta;
	
	@ManyToOne
	@JoinColumn(name = "id_producto", referencedColumnName = "id_producto")
	private Producto producto;
	
	public DetalleVenta(String id_detalle, Integer cantidad, BigDecimal precio, BigDecimal sub_total, Venta venta,
			Producto producto) {
		super();
		this.id_detalle = id_detalle;
		this.cantidad = cantidad;
		this.precio = precio;
		this.sub_total = sub_total;
		this.venta = venta;
		this.producto = producto;
	}

	public String getId_detalle() {
		return id_detalle;
	}

	public void setId_detalle(String id_detalle) {
		this.id_detalle = id_detalle;
	}

	public Integer getCantidad() {
		return cantidad;
	}

	public void setCantidad(Integer cantidad) {
		this.cantidad = cantidad;
	}

	public BigDecimal getPrecio() {
		return precio;
	}

	public void setPrecio(BigDecimal precio) {
		this.precio = precio;
	}

	public BigDecimal getSub_total() {
		return sub_total;
	}

	public void setSub_total(BigDecimal sub_total) {
		this.sub_total = sub_total;
	}

	public Venta getVenta() {
		return venta;
	}

	public void setVenta(Venta venta) {
		this.venta = venta;
	}

	public Producto getProducto() {
		return producto;
	}

	public void setProducto(Producto producto) {
		this.producto = producto;
	}
	
	
	
}
