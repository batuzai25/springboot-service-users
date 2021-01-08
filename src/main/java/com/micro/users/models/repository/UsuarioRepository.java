package com.micro.users.models.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import org.springframework.data.rest.core.annotation.RestResource;

import com.micro.users.commons.models.entity.User;



@RepositoryRestResource(path = "user")
public interface UsuarioRepository extends JpaRepository<User, Long> {
	
	@RestResource(path = "buscarPorNombre")
	User findByUsername (@Param("username") String username);
	
	@Query(value = "select  u from User u where u.email=?1")
	User getUserbyEmail (String email);

}
