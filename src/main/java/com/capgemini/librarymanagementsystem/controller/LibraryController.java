package com.capgemini.librarymanagementsystem.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import com.capgemini.librarymanagementsystem.dto.BookInventory;
import com.capgemini.librarymanagementsystem.dto.Users;
import com.capgemini.librarymanagementsystem.service.CommonService;

@RestController
public class LibraryController {
	@Autowired
	private CommonService commonService;
	private List<BookInventory> bookInventory;
	
	@PostMapping("/login")
	public Users login(String id, String password) {
		 Users users = commonService.login(id, password);
		return users;
	}
	@GetMapping("/findBooksByName")
	public List<BookInventory> findBooksByName(String bookName){
		bookInventory = commonService.findBooksByName(bookName);
		return bookInventory;
	}
	@GetMapping("/findBooksByAuthor")
	public List<BookInventory> findBooksByAuthor(String author) {
		bookInventory = commonService.findBooksByAuthor(author);
		return bookInventory;
	}
	@GetMapping("findBooksByDepartmentName")
	public List<BookInventory> findBooksByDepartmentName(String departmentName){
		bookInventory = commonService.findBooksByDepartmentName(departmentName);
		return bookInventory;
	}
}
