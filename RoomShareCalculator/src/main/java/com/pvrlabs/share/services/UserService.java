/**
 * 
 */
package com.pvrlabs.share.services;

import java.util.List;

import com.pvrlabs.share.entities.User;
import com.pvrlabs.share.repositories.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;


@Service
@Transactional
public class UserService 
{
	@Autowired private UserRepository userRepository;
	
	public List<User> findAllUsers() {
		return userRepository.findAllUsers();
	}
	
}
