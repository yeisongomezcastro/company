package com.co.company.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

@Entity(name = "DetallePedido")
public class DetaPediEntity {
	@Id
	private String codPedido;
	@Column(nullable = false)
	private PedidosEntity pedido;
	@Column(nullable = false)
	private VariedadEntity variedad;
	@Column(nullable = false)
	private Integer tallosPedidos;
	@Column(nullable = false)
	private Integer tallosEntregados;

	public DetaPediEntity(String codPedido, PedidosEntity pedido, VariedadEntity variedad, Integer tallosPedidos,
			Integer tallosEntregados) {
		super();
		this.codPedido = codPedido;
		this.pedido = pedido;
		this.variedad = variedad;
		this.tallosPedidos = tallosPedidos;
		this.tallosEntregados = tallosEntregados;
	}

	public String getCodPedido() {
		return codPedido;
	}

	public void setCodPedido(String codPedido) {
		this.codPedido = codPedido;
	}

	public PedidosEntity getPedido() {
		return pedido;
	}

	public void setPedido(PedidosEntity pedido) {
		this.pedido = pedido;
	}

	public VariedadEntity getVariedad() {
		return variedad;
	}

	public void setVariedad(VariedadEntity variedad) {
		this.variedad = variedad;
	}

	public Integer getTallosPedidos() {
		return tallosPedidos;
	}

	public void setTallosPedidos(Integer tallosPedidos) {
		this.tallosPedidos = tallosPedidos;
	}

	public Integer getTallosEntregados() {
		return tallosEntregados;
	}

	public void setTallosEntregados(Integer tallosEntregados) {
		this.tallosEntregados = tallosEntregados;
	}

}
