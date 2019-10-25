package com.capgemini.librarymanagementsystem.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.PersistenceUnit;
import javax.persistence.Query;

import org.springframework.stereotype.Repository;

import com.capgemini.librarymanagementsystem.dto.BookInventory;
import com.capgemini.librarymanagementsystem.dto.Users;

@Repository
public class CommonDaoImpl implements CommonDao{
	
	@PersistenceUnit
	private EntityManagerFactory entityManagerFactory;
	//login
	@Override
	public Users login(String id, String password) {
		EntityManager entityManager = entityManagerFactory.createEntityManager();
		Users userDetails = entityManager.find(Users.class, id);
		if (userDetails !=null) {
			return userDetails;
		} else {
			return null;
		}
	}//end of login

	//findBooksByName
	@Override
	public List<BookInventory> findBooksByName(String bookName) {
		EntityManager entityManager = entityManagerFactory.createEntityManager();
		String details = "from BookInventory where bookName=:bookName";
		Query query = entityManager.createQuery(details);
		query.setParameter("bookName", bookName);
		List<BookInventory> details2 = query.getResultList();
		System.out.println(details2);
		return details2;
	}//end of findBooksByName

	//findBooksByAuthor
	@Override
	public List<BookInventory> findBooksByAuthor(String author) {
		EntityManager entityManager = entityManagerFactory.createEntityManager();
		String details = "from BookInventory where author=:author";
		Query query = entityManager.createQuery(details);
		query.setParameter("author", author);
		List<BookInventory> details2 = query.getResultList();
		System.out.println(details2);
		return details2;
	}//end of findBooksByAuthor

	//findBooksByDepartmentName
	@Override
	public List<BookInventory> findBooksByDepartmentName(String departmentName) {
		EntityManager entityManager = entityManagerFactory.createEntityManager();
		String details = "from BookInventory where departmentName=:departmentName";
		Query query = entityManager.createQuery(details);
		query.setParameter("departmentName", departmentName);
		List<BookInventory> details2 = query.getResultList();
		System.out.println(details2);
		return details2;
	}//end of findBooksByDepartmentName
}//end of class
