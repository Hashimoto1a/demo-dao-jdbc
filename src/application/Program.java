package application;

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
		
		System.out.println("=== test 2: seller findByDepartment ===");
		
		Department dep = new Department(2, null);
		
		List<Seller> list = sellerdao.findByDepartment(dep);
		
		for(Seller obj: list) {
			System.out.println(obj);
		}
		
	}
}