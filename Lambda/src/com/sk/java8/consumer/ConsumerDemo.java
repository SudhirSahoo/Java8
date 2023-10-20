package com.sk.java8.consumer;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;

public class ConsumerDemo {

	public static void main(String[] args) {

		ConsumerDemo demo = new ConsumerDemo();
		//demo.accept(5);
		
		Consumer<Integer> c = i -> {System.out.println(i);};
		//c.accept(2);
		
		List<Integer> list = Arrays.asList(1,2,3,4,5);
		list.stream().forEach((j) -> {
			System.out.println(j);
		});
	}

	

}
