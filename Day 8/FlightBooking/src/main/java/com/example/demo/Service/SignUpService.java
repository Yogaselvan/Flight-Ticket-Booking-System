package com.example.demo.Service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Service;

import com.example.demo.Repository.SignUpRepository;
//import com.example.demo.model.Login;
import com.example.demo.Model.Signup;

@Service
public class SignUpService {
	
@Autowired
SignUpRepository repository;

public String addsignup(Signup Signup) {
	repository.save(Signup);
	return "added";
}

public List<Signup> getsignup(){
	return repository.findAll();
}

public String deletesignupById(int id) {
	repository.deleteById(id);;
	return "deleted";
}

public String Updatesignup(Signup Signup) {
	repository.save(Signup);
	return "saved";
}

public Optional<Signup> getByEmail(String username,String password){
	return repository.findByUsernameAndPassword(username, password);
}
}