package com.sk.java8.stream;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.function.Consumer;
import java.util.function.Predicate;

public class ForEachDemo {

	public static void main(String[] args) {
		
		List<String> list = Arrays.asList("Sudhir", "Kumar", "Sahoo");
		
		/*for(String s: list) {
			System.out.println(s);
		}*/
		
		Predicate<String> p = t -> t.startsWith("S"); 
		list.stream().filter(t -> t.startsWith("S")).forEach( s -> System.out.println(s));
		
		//list.forEach(s -> System.out.println(s));
		
		Map<String, String> map = new HashMap<String, String>();
		map.put("First Name", "Sudhir");
		map.put("Middle Name", "Kumar");
		map.put("Last Name", "Sahoo");
		
		//map.forEach((key, value) -> System.out.println(key));
		//map.entrySet().forEach(m -> System.out.println(m));
		
		map.entrySet().stream().filter((m) -> m.getValue().startsWith("K")).forEach(t -> System.out.println(t));
		
		/*
		 * Consumer<String> c = (t) -> System.out.println(t); for(String s: list) {
		 * c.accept(s); }
		 */

	}

}
