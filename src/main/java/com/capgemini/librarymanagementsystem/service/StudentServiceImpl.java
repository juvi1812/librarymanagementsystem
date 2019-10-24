package com.capgemini.librarymanagementsystem.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.capgemini.librarymanagementsystem.dao.StudentDao;
import com.capgemini.librarymanagementsystem.dto.BookInventory;

@Service
public class StudentServiceImpl implements StudentService {

	@Autowired
	private StudentDao studentDao;
	
	@Override
	public BookInventory requestForBook(String bookId, String id) {
		return studentDao.requestForBook(bookId, id);
	}

	@Override
	public BookInventory returnBook(String bookId, String id) {
		return studentDao.returnBook(bookId, id);
	}

	@Override
	public BookInventory renewBook(String bookId, String id) {
		return studentDao.renewBook(bookId, id);
	}

	@Override
	public BookInventory cancelBookRequest(String bookId, String id) {
		return studentDao.cancelBookRequest(bookId, id);
	}

}
