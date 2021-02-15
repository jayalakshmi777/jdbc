package com.lambda;

import java.util.Date;
import java.util.function.Consumer;
import java.util.function.Supplier;

public class Demo3 {

	public static void main(String[] args) {
		/*Consumer<String>c1=s->System.out.println(s+" String 1");
		Consumer<String>c2=s->System.out.println(s+" String 2");
		Consumer<String>c3=s->System.out.println(s+" String 3");
		c1.accept("null");
		c1.andThen(c3).andThen(c2).accept("empty");*/
		
		
		Supplier<Date>s=()->new Date();
		s.get();
		System.out.println("date is "+s.get());

	}

}
