package com.sk.java8.lambda;

public class LambdaExample {

	public static void main(String[] args) {

//		Math m = new MathImpl();
//		int i = m.add();
//		System.out.println(i);
		
		
		
		Math m1 = (int n1) -> n1;
		
		int j = m1.add(1);
		System.out.println(j);
	}
	

}
