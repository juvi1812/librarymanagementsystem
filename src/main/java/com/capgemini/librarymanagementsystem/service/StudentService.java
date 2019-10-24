package com.capgemini.librarymanagementsystem.service;

import com.capgemini.librarymanagementsystem.dto.BookInventory;
import com.capgemini.librarymanagementsystem.dto.Users;

public interface StudentService {

	public BookInventory requestForBook(String bookId, String id);
	public BookInventory returnBook(String bookId,String id);
	public BookInventory renewBook(String bookId,String id);
	public BookInventory cancelBookRequest(String bookId,String id);
	
}
