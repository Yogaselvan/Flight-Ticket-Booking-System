package com.example.demo.Controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.Service.SignUpService;
//import com.example.demo.model.Login;
import com.example.demo.Model.Signup;

@RestController
//@CrossOrigin(origins = "http://localhost:8080")
@CrossOrigin("*")
public class SignupController {
	
	@Autowired
	SignUpService service;
	
	@PostMapping("/")
	public String add(@RequestBody Signup Signup ) {
		return service.addsignup(Signup);
	}
	
	@GetMapping("/get")
	public List<Signup> read(){
		return service.getsignup();
	}
	@DeleteMapping("/Signup/{id}")
	public String delete(@PathVariable int id) {
		return service.deletesignupById(id);
	}
	@PutMapping("/Signup")
	public String Update(Signup Signup) {
		return service.Updatesignup(Signup);
	}
	
	 @GetMapping("/login/{username}/{password}")
	 public Optional<Signup> getdetails(@PathVariable String username,@PathVariable String password){
		 return service.getByEmail(username,password);
 }
}