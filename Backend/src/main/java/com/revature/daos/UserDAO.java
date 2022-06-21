package com.revature.daos;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.revature.models.User;

import net.bytebuddy.dynamic.DynamicType.Builder.FieldDefinition.Optional;

@Repository 
public interface UserDAO extends JpaRepository <User, Integer>{
	
	//for logging in finds username and password......I hope it works
	public Optional<List<User>> findByUsernameAndPassword(String username, String password);

}
