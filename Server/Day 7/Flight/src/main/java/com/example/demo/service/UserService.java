package com.example.demo.service;

import java.util.List;


import com.example.demo.model.User;
import com.example.demo.userdto.Userdto;

public interface UserService {

	String addUser(Userdto userdto);

	List<User> getUser();

	void deleteUserById(int id);

	User updateUserById(int id, Userdto userdto);



}