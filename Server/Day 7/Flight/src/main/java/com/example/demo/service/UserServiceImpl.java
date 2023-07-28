package com.example.demo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.model.User;
import com.example.demo.repository.UserRepository;
import com.example.demo.userdto.Userdto;

@Service
public class UserServiceImpl implements UserService {

	@Autowired
    private UserRepository userRepo;
    @Override
	public String addUser(Userdto userdto) {
		User user = new User(
                userdto.getId(),
                userdto.getUserName(),
           
                userdto.getEmail(),
                userdto.getPassword()
                
        );
        userRepo.save(user);
        return user.getUserName();
	}

	@Override
	public List<User> getUser() {
		return userRepo.findAll();
		
	}
	@Override
    public void deleteUserById(int id) {
        userRepo.deleteById(id);
    }
	 @Override
	    public User updateUserById(int id, Userdto userdto) {
	        User user = userRepo.findById(id).orElse(null);
	        if (user != null) {
	            user.setUserName(userdto.getUserName());
	            user.setEmail(userdto.getEmail());
	            user.setPassword(userdto.getPassword());
	            return userRepo.save(user);
	        }
	        return null; // Handle if user not found
	    }
	

}