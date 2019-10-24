package com.capgemini.librarymanagementsystem.dao;

import java.util.List;

import com.capgemini.librarymanagementsystem.dto.Users;

public interface AdminDao {
	//admin operations
	public Users addLibrarian(Users users);
	public Users deleteLibrarian(String id);
	public Users updateLibrarian(Users users);
	public List<Users> displayLibrarian();
}
