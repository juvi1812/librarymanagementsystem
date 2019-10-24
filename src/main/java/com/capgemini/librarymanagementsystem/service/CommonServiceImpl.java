package com.capgemini.librarymanagementsystem.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.capgemini.librarymanagementsystem.dao.CommonDao;
import com.capgemini.librarymanagementsystem.dto.BookInventory;
import com.capgemini.librarymanagementsystem.dto.Users;

@Service
public class CommonServiceImpl implements CommonService{
	
	@Autowired
	private CommonDao commonDao;
	
	@Override
	public Users login(String id, String password) {
		return commonDao.login(id, password);
	}

	@Override
	public List<BookInventory> findBooksByName(String bookName) {
		return commonDao.findBooksByName(bookName);
	}

	@Override
	public List<BookInventory> findBooksByAuthor(String author) {
		return commonDao.findBooksByAuthor(author);
	}

	@Override
	public List<BookInventory> findBooksByDepartmentName(String departmentName) {
		return commonDao.findBooksByDepartmentName(departmentName);
	}

}
