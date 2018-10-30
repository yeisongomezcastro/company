package com.co.company.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

@Entity(name="Cliente")
public class ClienteEntity {
	@Id
	private String codCliente;
	@Column(nullable=false)
	private String razonSocial;
	@Column(nullable=false)
	private String nit;
	@Column(nullable=false)
	private String direccion;
	@Column(nullable=false)
	private String telefono;
	@Column(nullable=false)
	private String correo;
	@Column(nullable=false)
	private String pais;
	
	public ClienteEntity() {
		
	}
	
	public ClienteEntity(String codCliente, String razonSocial, String nit, String direccion, String telefono,
			String correo, String pais, String departamento, String ciudad) {
		super();
		this.codCliente = codCliente;
		this.razonSocial = razonSocial;
		this.nit = nit;
		this.direccion = direccion;
		this.telefono = telefono;
		this.correo = correo;
		this.pais = pais;
		this.departamento = departamento;
		this.ciudad = ciudad;
	}
	public String getCodCliente() {
		return codCliente;
	}
	public void setCodCliente(String codCliente) {
		this.codCliente = codCliente;
	}
	public String getRazonSocial() {
		return razonSocial;
	}
	public void setRazonSocial(String razonSocial) {
		this.razonSocial = razonSocial;
	}
	public String getNit() {
		return nit;
	}
	public void setNit(String nit) {
		this.nit = nit;
	}
	public String getDireccion() {
		return direccion;
	}
	public void setDireccion(String direccion) {
		this.direccion = direccion;
	}
	public String getTelefono() {
		return telefono;
	}
	public void setTelefono(String telefono) {
		this.telefono = telefono;
	}
	public String getCorreo() {
		return correo;
	}
	public void setCorreo(String correo) {
		this.correo = correo;
	}
	public String getPais() {
		return pais;
	}
	public void setPais(String pais) {
		this.pais = pais;
	}
	public String getDepartamento() {
		return departamento;
	}
	public void setDepartamento(String departamento) {
		this.departamento = departamento;
	}
	public String getCiudad() {
		return ciudad;
	}
	public void setCiudad(String ciudad) {
		this.ciudad = ciudad;
	}
	@Column(nullable=false)
	private String departamento;
	@Column(nullable=false)
	private String ciudad;



}
