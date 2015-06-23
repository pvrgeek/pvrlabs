/**
 * 
 */
package com.pvrlabs.share.web;

import java.util.List;

import com.pvrlabs.share.entities.User;
import com.pvrlabs.share.services.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;


@Controller
public class UserController {

	@Autowired
	private UserService userService;
	
	@RequestMapping("/welcome")
	public String welcome(Model model) 
	{
		List<User> blogs = userService.findAllUsers();
		model.addAttribute("USERS", blogs);
		return "welcome";
	}
}
