package application;

import java.util.Date;

import db.model.entities.Department;
import db.model.entities.Seller;

public class Program {

	public static void main(String[] args) {
		
		Department obj = new Department(1, "Books");
		System.out.println(obj);
		//Integer id, String name, String email, Date birthDate, Double baseSalary, Department department
		Seller seller = new Seller(21, "Bob", "bob@gmail.com", new Date(), 3000.0, obj);
		
		System.out.println(seller);

	}

}
