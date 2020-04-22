package com.hs.manage.dao;

import java.util.List;

import javax.persistence.EntityManager;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.hs.manage.entity.User_Info;

@Repository
public class FindPasswordDaoImpl implements FindPasswordDao{
	
	@Autowired
	Connection conn;
	
	@Override
	public String findpassword(String id, String email) {
		EntityManager em = conn.getConnection();
		
		List<User_Info> pw = em.createNamedQuery("User_Info.findpassword", User_Info.class).
				setParameter("email", email).
				setParameter("id", id).
				getResultList();

		
		
		return null;
		
		
	}

}