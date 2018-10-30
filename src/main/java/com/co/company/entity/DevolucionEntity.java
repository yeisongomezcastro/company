package com.co.company.entity;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

@Entity(name = "Devolucion")
public class DevolucionEntity {
	@Id
	private String codDevolucion;
	@Column(nullable = false)
	private PedidosEntity pedido;
	@Column(nullable = false)
	private Date fechaDevolucion;
	@Column(nullable = false)
	private VariedadEntity variedad;
	@Column(nullable = false)
	private Integer tallosDevueltos;

	public DevolucionEntity(String codDevolucion, PedidosEntity pedido, Date fechaDevolucion, VariedadEntity variedad,
			Integer tallosDevueltos) {
		super();
		this.codDevolucion = codDevolucion;
		this.pedido = pedido;
		this.fechaDevolucion = fechaDevolucion;
		this.variedad = variedad;
		this.tallosDevueltos = tallosDevueltos;
	}

	public String getCodDevolucion() {
		return codDevolucion;
	}

	public void setCodDevolucion(String codDevolucion) {
		this.codDevolucion = codDevolucion;
	}

	public PedidosEntity getPedido() {
		return pedido;
	}

	public void setPedido(PedidosEntity pedido) {
		this.pedido = pedido;
	}

	public Date getFechaDevolucion() {
		return fechaDevolucion;
	}

	public void setFechaDevolucion(Date fechaDevolucion) {
		this.fechaDevolucion = fechaDevolucion;
	}

	public VariedadEntity getVariedad() {
		return variedad;
	}

	public void setVariedad(VariedadEntity variedad) {
		this.variedad = variedad;
	}

	public Integer getTallosDevueltos() {
		return tallosDevueltos;
	}

	public void setTallosDevueltos(Integer tallosDevueltos) {
		this.tallosDevueltos = tallosDevueltos;
	}

}
