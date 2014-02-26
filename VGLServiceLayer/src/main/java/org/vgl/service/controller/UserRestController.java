package org.vgl.service.controller;

import java.util.Date;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.vgl.service.data.model.User;
import org.vgl.service.data.repository.UserDao;
import org.vgl.service.data.trans.UserDTO;


/**
 * 
 * @author Cloude
 *
 */
@org.springframework.stereotype.Controller
public class UserRestController {
	
	@Autowired
	UserDao userDao;
	
	@RequestMapping("/user/add")
	public @ResponseBody UserDTO add(
			@RequestParam(value="email", required=false, defaultValue="cloude@aol.tw") String email) {
		
		User user = new User();
		user.setEmail(email);
		user.setCreateTime(new Date());
		
		user = userDao.save(user);
		
		UserDTO userDTO = new UserDTO();
		userDTO.setId(user.getId());
		userDTO.setEmail(user.getEmail());
		userDTO.setCreateTime(user.getCreateTime());
		
		return userDTO;
	}
	
	@RequestMapping("/user/findbyemail")
	public @ResponseBody UserDTO add() {
		
		return null;
	}
	
}
