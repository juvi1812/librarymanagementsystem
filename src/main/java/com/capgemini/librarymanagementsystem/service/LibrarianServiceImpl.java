package com.capgemini.librarymanagementsystem.service;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.capgemini.librarymanagementsystem.dao.LibrarianDao;
import com.capgemini.librarymanagementsystem.dto.BookInventory;
import com.capgemini.librarymanagementsystem.dto.BookRegistration;
import com.capgemini.librarymanagementsystem.dto.BookTransaction;
import com.capgemini.librarymanagementsystem.dto.Users;

@Service
public class LibrarianServiceImpl implements LibrarianService{

	@Autowired
	private LibrarianDao librarianDao;
	
	@Override
	public BookInventory addBook(BookInventory bookInventory) {
		return librarianDao.addBook(bookInventory);
	}

	@Override
	public BookInventory deleteBook(String bookId) {
		return librarianDao.deleteBook(bookId);
	}

	@Override
	public BookTransaction approvalBook() {
		return librarianDao.approvalBook();
	}

	@Override
	public int fine(BookRegistration bookRegisteration) {
		return librarianDao.fine(bookRegisteration);
	}

	@Override
	public Users addUser(Users users) {
		return librarianDao.addUser(users);
	}
}
