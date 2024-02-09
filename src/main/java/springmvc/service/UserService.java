package springmvc.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import springmvc.dao.UserDAO;
import springmvc.model.User;

@Service
public class UserService {

	
	@Autowired
	private UserDAO userDAO;
	
	public int saveUser(User user) {
		
		return userDAO.saveUser(user);
		
	}
	
	
}
