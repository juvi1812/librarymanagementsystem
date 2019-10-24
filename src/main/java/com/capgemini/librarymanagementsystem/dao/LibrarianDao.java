package com.capgemini.librarymanagementsystem.dao;

import com.capgemini.librarymanagementsystem.dto.BookInventory;
import com.capgemini.librarymanagementsystem.dto.BookRegistration;
import com.capgemini.librarymanagementsystem.dto.BookTransaction;
import com.capgemini.librarymanagementsystem.dto.Users;

public interface LibrarianDao {
	//librarian operations
	public BookInventory addBook(BookInventory bookInventory);
	public BookInventory deleteBook(String bookId);
	public BookTransaction approvalBook();
	public int fine(BookRegistration bookRegisteration);
	public Users addUser(Users users);
}
