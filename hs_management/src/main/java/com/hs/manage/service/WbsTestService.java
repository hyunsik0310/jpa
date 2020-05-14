package com.hs.manage.service;

import java.util.List;

import com.hs.manage.entity.User_Info;
import com.hs.manage.entity.Wbs_2020;
import com.hs.manage.entity.Workplaceinfo;

public interface WbsTestService {


	public List<User_Info> selectWbsCheck(String u_no);

	public List<Wbs_2020> selectWbsCheck2(String u_no);

	public List<Workplaceinfo> selectWbsCheck3(String u_no);


}
