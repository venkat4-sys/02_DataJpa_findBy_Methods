package com.ashokit.repo;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.ashokit.entity.Book;

public interface BookRepository extends JpaRepository<Book,Integer> {
	
	
	/*
	 *    1.findBy Methods are used to perform only select operations

          2.Using Non Primary Key columns also we can select records

          3.In findBy Methods method name is very important because based on method name JPA will construct the query for execution.

          Note: findBy methods should represent Entity class variables
	 * 
	 * 
	 * 
	 */
	
//	select * from book where bookprice > :bookprice
	public List<Book> findByBookPriceIsGreaterThan(double BookPrice);
	
//	select * from book where bookprice < :bookprice
	public List<Book> findByBookPriceIsLessThan(double BookPrice);
	
//	select * from book where bookprice < :bookprice
	public List<Book> findByBookName(String bookName);
	
	
	

}
