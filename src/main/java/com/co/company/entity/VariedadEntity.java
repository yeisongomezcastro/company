package com.co.company.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

@Entity(name="Variedad")
public class VariedadEntity {
	@Id
	private String codVariedad;
	@Column(nullable= false)
	private String nomVariedad;
	
	public VariedadEntity() {
		
	}
	
	public VariedadEntity(String codVariedad, String nomVariedad) {
		super();
		this.codVariedad = codVariedad;
		this.nomVariedad = nomVariedad;
	}


	public String getCodVariedad() {
		return codVariedad;
	}
	public void setCodVariedad(String codVariedad) {
		this.codVariedad = codVariedad;
	}
	public String getNomVariedad() {
		return nomVariedad;
	}
	public void setNomVariedad(String nomVariedad) {
		this.nomVariedad = nomVariedad;
	}
	
}
