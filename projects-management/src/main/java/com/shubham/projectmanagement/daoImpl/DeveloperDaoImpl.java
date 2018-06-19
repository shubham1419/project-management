package com.shubham.projectmanagement.daoImpl;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Repository;

import com.shubham.projectmanagement.dao.DeveloperDao;
import com.shubham.projectmanagement.dto.Developer;

@Repository("developerDao")
public class DeveloperDaoImpl implements DeveloperDao {

	private static List<Developer> devlopers = new ArrayList<>();
	
	static{
		
		Developer developer = new Developer();
		
		developer.setId(1);
		developer.setName("DName");
		developer.setAddress("Address1");
		developer.setDesignation("Designation1");
		developer.setEmail("email1");
		developer.setPassword("pass");
		developer.setPhone("12345");
		developer.setRole("Team Lead");
		developer.setStatus(true);
		
		devlopers.add(developer);
		
		developer.setId(2);
		developer.setName("DName2");
		developer.setAddress("Address2");
		developer.setDesignation("Designation2");
		developer.setEmail("email2");
		developer.setPassword("pass2");
		developer.setPhone("12345586");
		developer.setRole("Team Lead2");
		developer.setStatus(true);
		
		devlopers.add(developer);
		
	}
	
	public Developer get(int id) {
		// TODO Auto-generated method stub
		return null;
	}

	public List<Developer> list() {
		// TODO Auto-generated method stub
		return devlopers;
	}

	public boolean add(Developer developer) {
		// TODO Auto-generated method stub
		return false;
	}

	public boolean update(Developer developer) {
		// TODO Auto-generated method stub
		return false;
	}

	public boolean delete(Developer developer) {
		// TODO Auto-generated method stub
		return false;
	}

}
