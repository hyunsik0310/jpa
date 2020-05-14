package com.hs.manage.dao;

import java.util.List;

import com.hs.manage.entity.User_Info;
import com.hs.manage.entity.Wbs_2020;
import com.hs.manage.entity.Workplaceinfo;

public interface WbsTestDao {


	
	public List<User_Info> Wbs1(String u_no);

	public List<Wbs_2020> Wbs2(String u_no);

	public List<Workplaceinfo> Wbs3(String u_no);


}
