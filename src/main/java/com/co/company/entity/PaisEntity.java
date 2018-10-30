package com.co.company.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

@Entity(name = "Pais")
public class PaisEntity {
	@Id
	private String codPais;
	@Column(nullable = false)
	private String nombrePais;

	public PaisEntity(String codPais, String nombrePais) {
		super();
		this.codPais = codPais;
		this.nombrePais = nombrePais;
	}

	public String getCodPais() {
		return codPais;
	}

	public void setCodPais(String codPais) {
		this.codPais = codPais;
	}

	public String getNombrePais() {
		return nombrePais;
	}

	public void setNombrePais(String nombrePais) {
		this.nombrePais = nombrePais;
	}

}
