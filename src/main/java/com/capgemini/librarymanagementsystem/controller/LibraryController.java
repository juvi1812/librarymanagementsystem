package com.capgemini.librarymanagementsystem.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RestController;

import com.capgemini.librarymanagementsystem.dao.LibrarianDao;
import com.capgemini.librarymanagementsystem.dto.BookInventory;
import com.capgemini.librarymanagementsystem.dto.BookRegistration;
import com.capgemini.librarymanagementsystem.dto.BookTransaction;
import com.capgemini.librarymanagementsystem.dto.Users;
import com.capgemini.librarymanagementsystem.service.AdminService;
import com.capgemini.librarymanagementsystem.service.CommonService;
import com.capgemini.librarymanagementsystem.service.LibrarianService;

import antlr.collections.impl.LList;

@RestController
public class LibraryController {
	@Autowired
	private CommonService commonService;
	private List<BookInventory> bookInventorys;
	private AdminService adminService;
	private BookInventory bookInventory;
	private LibrarianService librarianService;
	
	@PostMapping("/login")
	public Users login(String id, String password) {
	 Users users = commonService.login(id, password);
		return users;
	}
	@GetMapping("/findBooksByName")
	public List<BookInventory> findBooksByName(String bookName){
		bookInventorys = commonService.findBooksByName(bookName);
		return bookInventorys;
	}
	@GetMapping("/findBooksByAuthor")
	public List<BookInventory> findBooksByAuthor(String author) {
		bookInventorys = commonService.findBooksByAuthor(author);
		return bookInventorys;
	}
	@GetMapping("findBooksByDepartmentName")
	public List<BookInventory> findBooksByDepartmentName(String departmentName){
		bookInventorys = commonService.findBooksByDepartmentName(departmentName);
		return bookInventorys;
	}
	@PostMapping("/addLibrarian")
	public Users addLibrarian(Users users) {
		Users user= adminService.addLibrarian(users);
		return user;
	}
	@DeleteMapping("/deleteLibrarian")
	public Users deleteLibrarian(String id) {
		Users users = adminService.deleteLibrarian(id);
		return users;
	}
	@PutMapping("/updateLibrarian")
	public Users updateLibrarian(Users users) {
		Users user = adminService.updateLibrarian(users);
		return user;
	}
	@GetMapping("/displayLibrarian")
	public List<Users> displayLibrarian(){
		List<Users> user = adminService.displayLibrarian();
		return user;
	}
	@PostMapping("/addBook")
	public BookInventory addBook(BookInventory bookInventory) {
		bookInventory = librarianService.addBook(bookInventory);
		return bookInventory;
	}
	@DeleteMapping("/deleteBook")
	public BookInventory deleteBook(String bookId) {
		bookInventory = librarianService.deleteBook(bookId);
		return bookInventory;
	}
	@PostMapping("/addUser")
	public Users addUser(Users users) {
		Users user = librarianService.addUser(users);
		return user;
	}
	//incomplete
	@GetMapping("/fine")
	public int fine(BookRegistration bookRegisteration) {
		return 1;
	}
	@GetMapping("/approvalBook")
	public BookTransaction approvalBook() {
		BookTransaction bookTransaction = librarianService.approvalBook();
		return bookTransaction;
	}
}
