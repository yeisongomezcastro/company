package com.co.company.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

@Entity(name = "TipoVenta")
public class TipoVentaEntity {
	@Id
	private String codTipoVenta;
	@Column(nullable = false)
	private String nombreTipoVenta;

	public TipoVentaEntity() {

	}

	public TipoVentaEntity(String codTipoVenta, String nombreTipoVenta) {
		super();
		this.codTipoVenta = codTipoVenta;
		this.nombreTipoVenta = nombreTipoVenta;
	}

	public String getCodTipoVenta() {
		return codTipoVenta;
	}

	public void setCodTipoVenta(String codTipoVenta) {
		this.codTipoVenta = codTipoVenta;
	}

	public String getNombreTipoVenta() {
		return nombreTipoVenta;
	}

	public void setNombreTipoVenta(String nombreTipoVenta) {
		this.nombreTipoVenta = nombreTipoVenta;
	}

}
