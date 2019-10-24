package com.capgemini.librarymanagementsystem.dao;

import java.util.List;

import com.capgemini.librarymanagementsystem.dto.BookInventory;
import com.capgemini.librarymanagementsystem.dto.Users;

public interface CommonDao {
	//common operations
	public Users login(String id, String password);
	public List<BookInventory> findBooksByName(String bookName);
	public List<BookInventory> findBooksByAuthor(String author);
	public List<BookInventory> findBooksByDepartmentName(String departmentName);
}
