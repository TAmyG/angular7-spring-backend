package com.gosystems.springboot.backend.apirest.models.entity;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.validation.constraints.Email;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

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
	
	private String foto;
	
	//Lazy indica que solo se llamaran a las regiones cuando dentro del objeto
	//se realice un getRegion no antes
	@ManyToOne(fetch=FetchType.LAZY)
	@JoinColumn(name="region_id")
	@JsonIgnoreProperties({"hibernateLazyInitializer", "handler"})
	@NotNull(message="La region no puede ser vacia")
	private Region region;
	
	/*@PrePersist
	public void prePersist() {
		this.createAt = new Date();
	}*/

	public Region getRegion() {
		return region;
	}

	public void setRegion(Region region) {
		this.region = region;
	}

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
	
	
	
	public String getFoto() {
		return foto;
	}

	public void setFoto(String foto) {
		this.foto = foto;
	}



	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

}
