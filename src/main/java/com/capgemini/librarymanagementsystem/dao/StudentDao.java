package com.capgemini.librarymanagementsystem.dao;

import com.capgemini.librarymanagementsystem.dto.BookInventory;
import com.capgemini.librarymanagementsystem.dto.Users;

public interface StudentDao {

	public BookInventory requestForBook(String bookId, String id);
	public BookInventory returnBook(String bookId,String id);
	public BookInventory renewBook(String bookId,String id);
	public BookInventory cancelBookRequest(String bookId,String id);
	
}
