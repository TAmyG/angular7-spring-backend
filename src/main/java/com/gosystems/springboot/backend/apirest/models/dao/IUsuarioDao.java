package com.gosystems.springboot.backend.apirest.models.dao;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

import com.gosystems.springboot.backend.apirest.models.entity.Usuario;

public interface IUsuarioDao extends CrudRepository<Usuario, Long>{

	// Forma jpa notacion
	public Usuario findByUsername(String username);
	
	// forma query, no importa el nombre
	@Query("select u from Usuario u where u.username=?1")
	public Usuario findByUsername2(String username);
}
