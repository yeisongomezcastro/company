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
	private Date FechaEntrega;
	@Column(nullable = false)
	private Date FechaPedido;
	@Column(nullable = false)
	private Integer CantidadPedida;
	@Column(nullable = false)
	private Integer CantidadEntregada;
	@Column(nullable = false)
	private Integer TotalTallosPedidos;

	public PedidosEntity() {
	}

	public PedidosEntity(String codPedido, ClienteEntity cliente, TipoVentaEntity tipoVenta, Date fechaEntrega,
			Date fechaPedido, Integer cantidadPedida, Integer cantidadEntregada, Integer totalTallosPedidos) {
		super();
		this.codPedido = codPedido;
		this.cliente = cliente;
		this.tipoVenta = tipoVenta;
		FechaEntrega = fechaEntrega;
		FechaPedido = fechaPedido;
		CantidadPedida = cantidadPedida;
		CantidadEntregada = cantidadEntregada;
		TotalTallosPedidos = totalTallosPedidos;
	}

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
		return FechaEntrega;
	}

	public void setFechaEntrega(Date fechaEntrega) {
		FechaEntrega = fechaEntrega;
	}

	public Date getFechaPedido() {
		return FechaPedido;
	}

	public void setFechaPedido(Date fechaPedido) {
		FechaPedido = fechaPedido;
	}

	public Integer getCantidadPedida() {
		return CantidadPedida;
	}

	public void setCantidadPedida(Integer cantidadPedida) {
		CantidadPedida = cantidadPedida;
	}

	public Integer getCantidadEntregada() {
		return CantidadEntregada;
	}

	public void setCantidadEntregada(Integer cantidadEntregada) {
		CantidadEntregada = cantidadEntregada;
	}

	public Integer getTotalTallosPedidos() {
		return TotalTallosPedidos;
	}

	public void setTotalTallosPedidos(Integer totalTallosPedidos) {
		TotalTallosPedidos = totalTallosPedidos;
	}

}
