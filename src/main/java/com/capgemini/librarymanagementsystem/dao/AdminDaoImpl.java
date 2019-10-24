package com.capgemini.librarymanagementsystem.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
import javax.persistence.PersistenceUnit;
import javax.persistence.Query;

import org.springframework.stereotype.Repository;

import com.capgemini.librarymanagementsystem.dto.Users;

@Repository
public class AdminDaoImpl implements AdminDao {

	@PersistenceUnit
	private EntityManagerFactory entityManagerFactory;
	EntityManager entityManager = entityManagerFactory.createEntityManager();
	EntityTransaction transaction=null;

	//addLibrarian
	@Override
	public Users addLibrarian(Users users) {
		transaction= entityManager.getTransaction();
		transaction.begin();
		try {
			entityManager.persist(users);
			transaction.commit();
		} catch (Exception e) {
			e.printStackTrace();
		}
		return users;
	}//end of addLibrarian

	//deleteLibrarian
	@Override
	public Users deleteLibrarian(String id) {
		transaction= entityManager.getTransaction();
		try {
			Users users=entityManager.find(Users.class, id);
			transaction.begin();
			entityManager.remove(users);
			transaction.commit();
		} catch (Exception e) {
			e.printStackTrace();
		}
		return null;
	}//end of deleteLibrarian

	//updateLibrarian
	@Override
	public Users updateLibrarian(Users users) {
		transaction=entityManager.getTransaction();
		transaction.begin();
		Users userUpdate=entityManager.find(Users.class, users.getId());
		try {
			userUpdate.setId(users.getId());
			userUpdate.setName(users.getName());
			userUpdate.setEmail(users.getEmail());
			userUpdate.setPassword(users.getPassword());
			userUpdate.setUserType(users.getUserType());
			transaction.commit();
			return userUpdate;
		} catch (Exception e) {
			e.printStackTrace();	
		}
		return userUpdate;
	}//end of updateLibrarian

	//displayLibrarian
	@Override
	public List<Users> displayLibrarian() {
		String jpqa="from Users where userType LIKE '%librarian%'";
		Query query=entityManager.createQuery(jpqa);
		List<Users> allLibrarian=null;
		allLibrarian=query.getResultList();
		return allLibrarian;
	}//end of displayLibrarian
}//end of class
