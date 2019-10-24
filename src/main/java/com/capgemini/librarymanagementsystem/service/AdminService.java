package com.capgemini.librarymanagementsystem.service;

import java.util.List;

import com.capgemini.librarymanagementsystem.dto.Users;

public interface AdminService {
	public Users addLibrarian(Users users);
	public Users deleteLibrarian(String id);
	public Users updateLibrarian(Users users);
	public List<Users> displayLibrarian();
}
