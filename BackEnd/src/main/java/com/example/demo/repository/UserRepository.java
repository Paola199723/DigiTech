package com.example.demo.repository;
import java.util.List;
import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.example.demo.model.UserModel;


public interface UserRepository extends JpaRepository <UserModel, Integer>{

	@Transactional(readOnly = false)
	Optional<UserModel> findByEMail(String EMail);

}
