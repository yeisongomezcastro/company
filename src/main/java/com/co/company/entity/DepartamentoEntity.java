package com.co.company.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

@Entity(name = "Departamento")
public class DepartamentoEntity {
	@Id
	private String codDepartamento;
	@Column(nullable = false)
	private PaisEntity pais;
	@Column(nullable = false)
	private String nombreDepartamento;

	public DepartamentoEntity(String codDepartamento, PaisEntity pais, String nombreDepartamento) {
		super();
		this.codDepartamento = codDepartamento;
		this.pais = pais;
		this.nombreDepartamento = nombreDepartamento;
	}

	public String getCodDepartamento() {
		return codDepartamento;
	}

	public void setCodDepartamento(String codDepartamento) {
		this.codDepartamento = codDepartamento;
	}

	public PaisEntity getPais() {
		return pais;
	}

	public void setPais(PaisEntity pais) {
		this.pais = pais;
	}

	public String getNombreDepartamento() {
		return nombreDepartamento;
	}

	public void setNombreDepartamento(String nombreDepartamento) {
		this.nombreDepartamento = nombreDepartamento;
	}

}
