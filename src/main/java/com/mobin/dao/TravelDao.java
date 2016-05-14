package com.mobin.dao;

import java.util.List;

import com.mobin.domain.Travel;

public interface TravelDao {

	public List findPageRecords(int currentPageNum, int pageSize,String ST,String SP,String EP,String TDATA,String HGRADE,String sort);
	//public List findPageRecords(int startIndex, int pageSize,String ST);//管理员页面的数据分页
	public int getTotalRecords(String ST,String SP,String EP);
	public int getTotalRecords(String SP);
	public Boolean login(String user,String password);

	public void update();

}
