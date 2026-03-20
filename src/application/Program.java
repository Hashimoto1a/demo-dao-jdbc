package application;

import java.time.LocalDate;
import java.util.List;

import model.dao.DaoFactory;
import model.dao.SellerDao;
import model.entities.Department;
import model.entities.Seller;

public class Program{
	public static void main(String[] args) {
				
		SellerDao sellerdao = DaoFactory.createSellerDao();
		
		System.out.println("=== test 1: seller findById ===");
		Seller seller = sellerdao.findById(3);
		System.out.println(seller);
		
		System.out.println("\n=== test 2: seller findByDepartment ===");
		Department dep = new Department(2, null);
		List<Seller> list = sellerdao.findByDepartment(dep);
		for(Seller obj: list) {
			System.out.println(obj);
		}
		
		System.out.println("\n=== test 3: seller findAll ===");
		list = sellerdao.findAll();
		for(Seller obj: list) {
			System.out.println(obj);
		}
		
		System.out.println("\n=== test 4: seller insert ===");
		Seller newSeller = new Seller(null, "Greg", "greg@gmail.com", LocalDate.of(2021, 01, 01), 4000.0, dep);
		sellerdao.insert(newSeller);
		System.out.println("Inserted! New id = " + newSeller.getId());
		
		System.out.println("\n=== test 5: seller update ===");
		seller = sellerdao.findById(1);
		seller.setName("Martha");
		sellerdao.update(seller);
		System.out.println("update completed");
		
	}
}