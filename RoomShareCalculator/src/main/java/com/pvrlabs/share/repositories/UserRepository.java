/**
 * 
 */
package com.pvrlabs.share.repositories;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.pvrlabs.share.entities.User;
import com.pvrlabs.share.mappers.UserMapper;


@Repository
public class UserRepository {

	@Autowired
	private UserMapper userMapper;
	
	public User findUserById(Integer userId) {
		return userMapper.findUserById(userId);
	}

	public List<User> findAllUsers() {
		return userMapper.findAllUsers(); 
	}
}
