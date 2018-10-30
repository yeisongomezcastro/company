package com.co.company.entity;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

@Entity(name = "Pedidos")
public class PedidosEntity {
	@Id
	private String codPedido;
	@Column(nullable = false)
	private ClienteEntity cliente;
	@Column(nullable = false)
	private TipoVentaEntity tipoVenta;
	@Column(nullable = false)
	private Date fechaEntrega;
	@Column(nullable = false)
	private Date fechaPedido;
	@Column(nullable = false)
	private Integer cantidadPedida;
	@Column(nullable = false)
	private Integer cantidadEntregada;
	@Column(nullable = false)
	private Integer totalTallosPedidos;

	public String getCodPedido() {
		return codPedido;
	}

	public void setCodPedido(String codPedido) {
		this.codPedido = codPedido;
	}

	public ClienteEntity getCliente() {
		return cliente;
	}

	public void setCliente(ClienteEntity cliente) {
		this.cliente = cliente;
	}

	public TipoVentaEntity getTipoVenta() {
		return tipoVenta;
	}

	public void setTipoVenta(TipoVentaEntity tipoVenta) {
		this.tipoVenta = tipoVenta;
	}

	public Date getFechaEntrega() {
		return fechaEntrega;
	}

	public void setFechaEntrega(Date fechaEntrega) {
		this.fechaEntrega = fechaEntrega;
	}

	public Date getFechaPedido() {
		return fechaPedido;
	}

	public void setFechaPedido(Date fechaPedido) {
		this.fechaPedido = fechaPedido;
	}

	public Integer getCantidadPedida() {
		return cantidadPedida;
	}

	public void setCantidadPedida(Integer cantidadPedida) {
		this.cantidadPedida = cantidadPedida;
	}

	public Integer getCantidadEntregada() {
		return cantidadEntregada;
	}

	public void setCantidadEntregada(Integer cantidadEntregada) {
		this.cantidadEntregada = cantidadEntregada;
	}

	public Integer getTotalTallosPedidos() {
		return totalTallosPedidos;
	}

	public void setTotalTallosPedidos(Integer totalTallosPedidos) {
		this.totalTallosPedidos = totalTallosPedidos;
	}

}
