package com.practicante.model;

import java.math.BigDecimal;
import java.util.Date;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;

@Entity
@Table(name = "ventas")
public class Venta {
	
	@Id
	@Column(name = "id_venta")
	private String id_venta;
	
	@Column(name = "fecha")
	private Date fecha;
	
	@Column(name = "serie")
	private String serie;
	
	@Column(name = "numero")
	private String numero;
	
	@Column(name = "total")
	private BigDecimal total;
	
	@ManyToOne
	@JoinColumn(name = "id_cliente", referencedColumnName = "id_cliente")
	private Cliente cliente;
	
	@ManyToOne
	@JoinColumn(name = "id_producto", referencedColumnName = "id_producto")
	private Producto producto;
	
	public Venta(String id_venta, Date fecha, String serie, String numero, BigDecimal total, Cliente cliente,
			Producto producto) {
		super();
		this.id_venta = id_venta;
		this.fecha = fecha;
		this.serie = serie;
		this.numero = numero;
		this.total = total;
		this.cliente = cliente;
		this.producto = producto;
	}

	public String getId_venta() {
		return id_venta;
	}

	public void setId_venta(String id_venta) {
		this.id_venta = id_venta;
	}

	public Date getFecha() {
		return fecha;
	}

	public void setFecha(Date fecha) {
		this.fecha = fecha;
	}

	public String getSerie() {
		return serie;
	}

	public void setSerie(String serie) {
		this.serie = serie;
	}

	public String getNumero() {
		return numero;
	}

	public void setNumero(String numero) {
		this.numero = numero;
	}

	public BigDecimal getTotal() {
		return total;
	}

	public void setTotal(BigDecimal total) {
		this.total = total;
	}

	public Cliente getCliente() {
		return cliente;
	}

	public void setCliente(Cliente cliente) {
		this.cliente = cliente;
	}

	public Producto getProducto() {
		return producto;
	}

	public void setProducto(Producto producto) {
		this.producto = producto;
	}
	
	

}
