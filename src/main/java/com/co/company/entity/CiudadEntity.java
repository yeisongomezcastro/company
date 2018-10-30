package com.co.company.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

@Entity(name = "Ciudad")
public class CiudadEntity {
	@Id
	private String codCiudad;
	@Column(nullable = false)
	private DepartamentoEntity departamento;
	@Column(nullable = false)
	private String nombreCiudad;

	public CiudadEntity(String codCiudad, DepartamentoEntity departamento, String nombreCiudad) {
		super();
		this.codCiudad = codCiudad;
		this.departamento = departamento;
		this.nombreCiudad = nombreCiudad;
	}

	public String getCodCiudad() {
		return codCiudad;
	}

	public void setCodCiudad(String codCiudad) {
		this.codCiudad = codCiudad;
	}

	public DepartamentoEntity getDepartamento() {
		return departamento;
	}

	public void setDepartamento(DepartamentoEntity departamento) {
		this.departamento = departamento;
	}

	public String getNombreCiudad() {
		return nombreCiudad;
	}

	public void setNombreCiudad(String nombreCiudad) {
		this.nombreCiudad = nombreCiudad;
	}

}
