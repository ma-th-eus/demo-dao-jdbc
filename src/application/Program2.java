package application;

import java.util.List;
import java.util.Scanner;

import db.model.entities.Department;
import model.dao.DaoFactory;
import model.dao.DepartmentDao;

public class Program2 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		DepartmentDao departmentDao = DaoFactory.createDepartmentDao();
		
		System.out.println("=== TEST 1: Department findById =====");
		Department department = departmentDao.findById(2);
		System.out.println(department);
		
		System.out.println("\n\n=== TEST 2: Department update =====");
		department = departmentDao.findById(15);
		department.setName("Games");
		departmentDao.update(department);
		System.out.println("Update completed!");
		
		System.out.println("\n\n=== TEST 3: department insert =====");
		department = new Department(null, "Music");
		departmentDao.insert(department);
		System.out.println("Inserted!");
		
		System.out.println("\n\n=== TEST 4: department DELETE =====");
		departmentDao.deleteById(16);
		System.out.println("Deleted!");
		
		System.out.println("\n\n=== TEST #: Department findAll =====");
		List<Department> list = departmentDao.findAll();
		for(Department d : list) {
			System.out.println(d);
		}
		sc.close();
		
	}

}
