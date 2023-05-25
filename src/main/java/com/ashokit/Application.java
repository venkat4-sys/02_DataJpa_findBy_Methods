package com.ashokit;

import java.util.Arrays;
import java.util.List;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

import com.ashokit.entity.Book;
import com.ashokit.repo.BookRepository;

@SpringBootApplication
public class Application {

	public static void main(String[] args) {
		
		ConfigurableApplicationContext ctx = SpringApplication.run(Application.class, args);
		
		BookRepository repo = ctx.getBean(BookRepository.class);
		/*
		 * Book b1=new Book();
		b1.setBookId(110);
		b1.setBookName("spring Boot");
		b1.setBookPrice(125.0);
		
		Book b2=new Book();
		b2.setBookId(111);
		b2.setBookName("Core Java");
		b2.setBookPrice(140.0);
		
		Book b3=new Book();
		b3.setBookId(112);
		b3.setBookName("Advanced Java");
		b3.setBookPrice(150.0);
		
		Book b4=new Book();
		b4.setBookId(113);
		b4.setBookName("Microservices");
		b4.setBookPrice(190.0);
		
		repo.saveAll(Arrays.asList(b1,b2,b3,b4));
		 * 
		 * 
		 * 
		 */
		
		/*
		 * List<Book> records = repo.findByBookPriceIsGreaterThan(140);
		
		for(Book b:records) {
			System.out.println(b);
			
		}
		 * 
		 * 
		 */
		
		
		List<Book> record = repo.findByBookName("Microservices");
		
		for(Book b:record) {
			System.out.println(b);
			
		}
		
		
		
	}

}
