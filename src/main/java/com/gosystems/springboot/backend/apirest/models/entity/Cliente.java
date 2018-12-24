package com.gosystems.springboot.backend.apirest.models.entity;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.PrePersist;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.validation.constraints.Email;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

@Entity
@Table(name="clientes")
public class Cliente implements Serializable{
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Long id;	
	
	@NotEmpty(message="No puede estar vacio")
	@Size(min=4, max=12, message="el tamaño debe estar entre 4 y 12")
	@Column(nullable=false)
	private String nombre;
	
	@NotEmpty(message="No puede estar vacio")
	private String apellido;
	
	@NotEmpty(message="No puede estar vacio")
	@Email(message="no tiene el formato correcto")
	@Column(nullable=false, unique=true)
	private String email;
	
	@NotNull(message="No puede estar vacio")
	@Column(name="create_at")
	@Temporal(TemporalType.DATE)
	private java.util.Date createAt;
	
	/*@PrePersist
	public void prePersist() {
		this.createAt = new Date();
	}*/

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getApellido() {
		return apellido;
	}

	public void setApellido(String apellido) {
		this.apellido = apellido;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public java.util.Date getCreateAt() {
		return createAt;
	}

	public void setCreateAt(java.util.Date date) {
		this.createAt = date;
	}
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

}
