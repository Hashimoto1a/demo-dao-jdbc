package application;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

import model.entities.Department;
import model.entities.Seller;

public class Program{
	public static void main(String[] args) {
		DateTimeFormatter dtf = DateTimeFormatter.ofPattern("dd/MM/yyyy");
		
		
		Department obj = new Department(1, "books");
		
		Seller seller = new Seller(1, "jao", "jao@gmail.com", LocalDate.parse("01/01/2021", dtf), 3000.0, obj);
		
		System.out.println(seller);
	}
}