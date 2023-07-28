package com.example.demo.Repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.demo.Model.Signup;
@Repository
public interface SignUpRepository extends JpaRepository <Signup,Integer> {
    
	Optional <Signup> findByUsernameAndPassword(String username, String password);
}
