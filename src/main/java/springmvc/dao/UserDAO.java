package springmvc.dao;

import java.io.Serializable;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.orm.hibernate5.HibernateTemplate;
import org.springframework.stereotype.Repository;

import springmvc.model.User;

@Repository
public class UserDAO {

	@Autowired
	private HibernateTemplate hibernateTemplate;
	
	public int saveUser(User user) {
		
		int  res =(Integer) hibernateTemplate.save(user);
		return res;
	}
	
}
