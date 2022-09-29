package com.example.demo.repository;
import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.example.demo.model.UserModel;

@Repository
public interface UserRepository extends JpaRepository <UserModel, Integer>{

	@Query("select p from UserModel p where concat(p.getEmail,' ', Email) like %?1%")
	Optional findByEmail(String Email);
}
