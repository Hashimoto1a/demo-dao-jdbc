package application;

import java.util.ArrayList;
import java.util.List;

import model.dao.DaoFactory;
import model.dao.DepartmentDao;
import model.entities.Department;

public class Program2{
	public static void main(String[] args) {
		
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
		
		
		
		
	}	
}