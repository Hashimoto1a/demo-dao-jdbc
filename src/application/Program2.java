package application;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import model.dao.DaoFactory;
import model.dao.DepartmentDao;
import model.entities.Department;

public class Program2{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("=== test 1: Department findById ===");
		DepartmentDao departmentdao = DaoFactory.createDepartmentDao(); 
		Department dep = departmentdao.findById(2);
		System.out.println(dep);
	
	
		System.out.println("\n=== test 2: Department findAll ===");	
		List<Department> deps = new ArrayList<>();
		deps = departmentdao.findAll();
		for(Department d: deps) {
			System.out.println(d);
		}
		
		/*
		System.out.println("\n=== test 3: Department insert ===");
		Department dep2 = new Department(null, "D1");
		DepartmentDao departmentdao2 = DaoFactory.createDepartmentDao();
		departmentdao2.insert(dep2);
		System.out.println("department inserted");
		
		
		System.out.println("\n=== test 4: Department update ===");
		Department dep3 = new Department();
		DepartmentDao departmentdao3 = DaoFactory.createDepartmentDao();
		dep3 = departmentdao3.findById(5);
		dep3.setName("research");
		departmentdao.update(dep3);
		System.out.println("update completed");
		
		
		*/
		System.out.println("\n=== test 5: Department delete ===");
		DepartmentDao departmentdao4 = DaoFactory.createDepartmentDao();
		System.out.println("enter the department's name: ");
		int id = sc.nextInt();
		departmentdao4.deleteById(id);
		System.out.println("department deleted");
		
		sc.close();
	}	
}