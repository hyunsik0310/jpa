package com.hs.manage.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.hs.manage.dao.FindPasswordDao;
import com.hs.manage.entity.User_Info;

@Service
public class FindPasswordServiceImpl implements FindPasswordService {
	
	@Autowired
	FindPasswordDao dao;
	
	@Override
	public String findpassword(String id, String email1, String email2) {
		
		User_Info userinfo = new User_Info();
		userinfo.setId(id);
		String email = email1+"@"+email2;
		userinfo.setEmail(email);
		
		String result = dao.findpassword(id,email);
		return result;
	}

}