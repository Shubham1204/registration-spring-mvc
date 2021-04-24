package com.userRegistration.repository;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.orm.hibernate5.HibernateTemplate;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.userRegistration.model.UserModel;

@Repository
public class UserRepository {

	@Autowired
	private HibernateTemplate hibernateTemplate;
	
	@Transactional
	public int saveUser(UserModel user) {
		int id = (Integer)hibernateTemplate.save(user);
		return id;
		
	}
	
}
