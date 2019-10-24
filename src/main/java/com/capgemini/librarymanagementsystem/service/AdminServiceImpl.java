package com.capgemini.librarymanagementsystem.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.capgemini.librarymanagementsystem.dao.AdminDao;
import com.capgemini.librarymanagementsystem.dto.Users;

@Service
public class AdminServiceImpl implements AdminService {

	@Autowired
	private AdminDao adminDao; 
	
	@Override
	public Users addLibrarian(Users users) {
		return adminDao.addLibrarian(users);
	}

	@Override
	public Users deleteLibrarian(String id) {
		return adminDao.deleteLibrarian(id);
	}

	@Override
	public Users updateLibrarian(Users users) {
	return adminDao.updateLibrarian(users);
	}

	@Override
	public List<Users> displayLibrarian() {
		return adminDao.displayLibrarian();
	}

}
