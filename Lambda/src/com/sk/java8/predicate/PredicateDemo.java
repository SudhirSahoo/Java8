package com.sk.java8.predicate;

import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;

public class PredicateDemo {

	public static void main(String[] args) {
		PredicateDemo demo = new PredicateDemo();
		//boolean b = demo.test(6);
		//System.out.println(b);
		
		Predicate<Integer> p = (i) -> {
			return i%2 == 0;
		};
		System.out.println(p.test(6));
		
		List<Integer> list = Arrays.asList(2,3,6,8,19,20);
		
		list.stream().filter(i -> i%2 == 0).forEach(i -> System.out.println(i));

	}

}
