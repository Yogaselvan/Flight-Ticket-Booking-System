package com.example.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.userdto.Userdto;
import com.example.demo.model.User;
import com.example.demo.service.UserService;
@RestController
@CrossOrigin
@RequestMapping("/register")
public class Controller {
	 @Autowired
	    UserService userService;
	 
	      @PostMapping(path = "/save")
	    public String savePassenger(@RequestBody Userdto userdto)
	    {
	    	String id = userService.addUser(userdto);
	        return id;
	        
	    }
	        @GetMapping("/get")
	    	public List<User> get()
	    	{
	    		return userService.getUser();
	    		
	    	}
	        @DeleteMapping("/delete/{id}")
	        public String deleteUser(@PathVariable int id) {
	            userService.deleteUserById(id);
	            return "User with ID " + id + " has been deleted.";
	        }
	        @PutMapping("/update/{id}")
	        public ResponseEntity<User> updateUserById(@PathVariable int id, @RequestBody Userdto userdto) {
	            User updatedUser = userService.updateUserById(id, userdto);
	            if (updatedUser != null) {
	                return new ResponseEntity<>(updatedUser, HttpStatus.OK);
	            } else {
	                return new ResponseEntity<>(HttpStatus.NOT_FOUND);
	            }
	        }
	        
    }