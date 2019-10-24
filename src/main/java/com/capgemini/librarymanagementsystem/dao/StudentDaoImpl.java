package com.capgemini.librarymanagementsystem.dao;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.PersistenceUnit;

import org.springframework.stereotype.Repository;

import com.capgemini.librarymanagementsystem.dto.BookInventory;

@Repository
public class StudentDaoImpl implements StudentDao {

	@PersistenceUnit
	private EntityManagerFactory entityManagerFactory;
	EntityManager entityManager = entityManagerFactory.createEntityManager();

	//requestForBook
	@Override
	public BookInventory requestForBook(String bookId, String id) {
		// TODO Auto-generated method stub
		return null;
	}

	//returnBook
	@Override
	public BookInventory returnBook(String bookId, String id) {
		// TODO Auto-generated method stub
		return null;
	}
	
	//renewBook
	@Override
	public BookInventory renewBook(String bookId, String id) {
		// TODO Auto-generated method stub
		return null;
	}

	//cancelBookRequest
	@Override
	public BookInventory cancelBookRequest(String bookId, String id) {
		// TODO Auto-generated method stub
		return null;
	}

}
