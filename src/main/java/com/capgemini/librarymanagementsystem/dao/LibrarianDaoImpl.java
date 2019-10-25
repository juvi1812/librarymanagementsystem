package com.capgemini.librarymanagementsystem.dao;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
import javax.persistence.PersistenceUnit;

import org.springframework.stereotype.Repository;

import com.capgemini.librarymanagementsystem.dto.BookInventory;
import com.capgemini.librarymanagementsystem.dto.BookRegistration;
import com.capgemini.librarymanagementsystem.dto.BookTransaction;
import com.capgemini.librarymanagementsystem.dto.Users;

@Repository
public class LibrarianDaoImpl implements LibrarianDao{
	
	@PersistenceUnit
	private EntityManagerFactory entityManagerFactory;

	//addBook
	@Override
	public BookInventory addBook(BookInventory bookInventory) {
		try {
			EntityManager entityManager = entityManagerFactory.createEntityManager();
			EntityTransaction entityTransaction = entityManager.getTransaction();
			entityTransaction.begin();
			entityManager.persist(bookInventory);
			entityTransaction.commit();
			entityManager.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
		return bookInventory;
	}//end of addBook

	//
	@Override
	public BookInventory deleteBook(String bookId) {
		EntityManager entityManager = entityManagerFactory.createEntityManager();
			EntityTransaction transaction=entityManager.getTransaction();
			BookInventory book=entityManager.find(BookInventory.class,bookId);
			if(book.getBookId().equalsIgnoreCase(bookId)) {
				transaction.begin();
				entityManager.remove(book);
				transaction.commit();
				entityManager.close();	
			}
		return book;
	}//end of deleteBook

	//addUser
	@Override
	public Users addUser(Users users) {
	try {
		EntityManager entityManager = entityManagerFactory.createEntityManager();
		EntityTransaction transaction = entityManager.getTransaction();
		transaction.begin();
		entityManager.persist(users);
		transaction.commit();
		entityManager.close();
	} catch (Exception e) {
		e.printStackTrace();
	}
	return users;
	}//end of addUser

	//fine
	@Override
	public int fine(BookRegistration bookRegisteration) {
		return 0;
	}//end of fine

	//approvalBook
	@Override
	public BookTransaction approvalBook() {
		return null;
	}//end of approvalBook
}
