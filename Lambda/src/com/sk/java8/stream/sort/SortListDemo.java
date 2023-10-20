package com.sk.java8.stream.sort;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class SortListDemo {

	public static void main(String[] args) {
		
		List<Employee> list = EmployeeDAO.getEmployees();
		
		List<Employee> list1 = list.stream().filter(e -> e.getSalary() > 50000).collect(Collectors.toList());
		
		//list1.forEach(e -> System.out.println(e.getSalary()));
		
		/*Collections.sort(list,  new EmployeeComparator());
		list.forEach((e -> System.out.println(e.getSalary())));
		*/
		
		/*
		Collections.sort(list,  new Comparator<Employee>(){

			@Override
			public int compare(Employee o1, Employee o2) {
				return (int) (o1.getSalary() - o2.getSalary());
			}
		});
		list.forEach((e -> System.out.println(e.getSalary())));
		*/
		
		/*Collections.sort(list,  (o1, o2) -> (int) (o2.getSalary() - o1.getSalary())	);
		list.forEach((e -> System.out.println(e.getSalary())));
		*/
		
		/*list.stream().sorted((o1, o2) -> (int) (o1.getSalary() - o2.getSalary())).forEach((System.out::println));
		list.forEach((System.out::println)); // Will print original - NOT in sorted order
		*/
		
		/*list.stream().sorted(Comparator.comparing(emp -> emp.getSalary())).forEach(System.out::println);
		 */
		
		/* // Method Reference
		list.stream().sorted(Comparator.comparing(Employee :: getSalary)).forEach(System.out :: println);;
		*/
		
	}

}
