package com.hs.manage.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;

import com.hs.manage.dao.WbsTestDao;
import com.hs.manage.entity.User_Info;
import com.hs.manage.entity.Wbs_2020;
import com.hs.manage.entity.Workplaceinfo;

@Service
@Repository
public class WbsTestServiceImpl implements WbsTestService {

	@Autowired
	WbsTestDao dao;
	
	@Override
	public List<User_Info> selectWbsCheck(String u_no) {
		
		User_Info user_Info = new User_Info();
		user_Info.setU_no(u_no);
		
		return dao.Wbs1(u_no);
	}

	@Override
	public List<Wbs_2020> selectWbsCheck2(String u_no) {
		
		Wbs_2020 wbs_2020 = new Wbs_2020();
		wbs_2020.setU_no(u_no);
		
		return dao.Wbs2(u_no);

	}

	@Override
	public List<Workplaceinfo> selectWbsCheck3(String u_no) {
		
		Workplaceinfo workplaceinfo = new Workplaceinfo();
		workplaceinfo.setU_no(u_no);
		
		
		return dao.Wbs3(u_no);

	}
	
}
