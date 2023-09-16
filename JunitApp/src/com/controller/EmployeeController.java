package com.controller;

import com.model.Employee;
import com.service.EmployeeService;

public class EmployeeController {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		EmployeeService empService=new EmployeeService();
		
		Employee emp1=new Employee(1,"Rohit","rohitkarale2104@gmail.com","9850777984","Mumbai",50000);
		Employee emp2=new Employee(2,"Rutika","rutikarale2104@gmail.com","9850777984","Mumbai",50000);
		Employee emp3=new Employee(3,"Tanmay","tohitkarale2104@gmail.com","9850777984","Mumbai",50000);
		Employee emp4=new Employee(4,"Saurav","sohitkarale2104@gmail.com","9850777984","Mumbai",50000);
		
		emp1=empService.computePerAnnumSalary(emp1);
		System.out.println(emp1);
		
		emp1=empService.computeIncrement(emp1);
		System.out.println(emp1);
		
		
		
		
	}
}
