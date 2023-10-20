package com.sk.java8.supplier;

import java.util.Arrays;
import java.util.List;
import java.util.function.Supplier;

public class SupplierDemo {

	public static void main(String[] args) {

		SupplierDemo demo = new SupplierDemo();
		
		Supplier s = () -> "Hello! I am Sudhir";
		//System.out.println(s.get());
		
		List<String> list = Arrays.asList();
		
		System.out.println(list.stream().findAny().orElseGet(() -> "Hello"));

	}

}
