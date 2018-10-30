package com.co.company.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

@Entity(name = "Precio")
public class PrecioEntity {
	@Id
	private String codPrecio;
	@Column(nullable = false)
	private double precioUSD;
	@Column(nullable = false)
	private double trm;

	public PrecioEntity(String codPrecio, double precioUSD, double trm) {
		super();
		this.codPrecio = codPrecio;
		this.precioUSD = precioUSD;
		this.trm = trm;
	}

	public String getCodPrecio() {
		return codPrecio;
	}

	public void setCodPrecio(String codPrecio) {
		this.codPrecio = codPrecio;
	}

	public double getPrecioUSD() {
		return precioUSD;
	}

	public void setPrecioUSD(double precioUSD) {
		this.precioUSD = precioUSD;
	}

	public double getTrm() {
		return trm;
	}

	public void setTrm(double trm) {
		this.trm = trm;
	}

}
