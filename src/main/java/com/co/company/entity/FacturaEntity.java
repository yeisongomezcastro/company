package com.co.company.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

@Entity(name = "Factura")
public class FacturaEntity {
	@Id
	private String codFactura;
	@Column(nullable = false)
	private PedidosEntity pedido;
	@Column(nullable = false)
	private VariedadEntity variedad;
	@Column(nullable = false)
	private double valorUSD;
	@Column(nullable = false)
	private double valorCOP;

	public FacturaEntity(String codFactura, PedidosEntity pedido, VariedadEntity variedad, double valorUSD,
			double valorCOP) {
		super();
		this.codFactura = codFactura;
		this.pedido = pedido;
		this.variedad = variedad;
		this.valorUSD = valorUSD;
		this.valorCOP = valorCOP;
	}

	public String getCodFactura() {
		return codFactura;
	}

	public void setCodFactura(String codFactura) {
		this.codFactura = codFactura;
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

	public double getValorUSD() {
		return valorUSD;
	}

	public void setValorUSD(double valorUSD) {
		this.valorUSD = valorUSD;
	}

	public double getValorCOP() {
		return valorCOP;
	}

	public void setValorCOP(double valorCOP) {
		this.valorCOP = valorCOP;
	}

}
