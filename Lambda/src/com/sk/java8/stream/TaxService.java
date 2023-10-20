package com.sk.java8.stream;

import java.util.List;
import java.util.stream.Collectors;

public class TaxService {
	
	public static List<Employee> getTaxableEmployees() {
		
		return EmployeeDAO.getEmployees().stream().filter((e) -> e.getSalary() > 500000).collect(Collectors.toList());
		
	}
	
	public static void main(String[] args) {
		System.out.println(getTaxableEmployees());

	}
}
