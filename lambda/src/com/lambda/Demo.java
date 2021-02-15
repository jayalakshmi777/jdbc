package com.lambda;

import java.util.function.Function;

public class Demo {

	public static void main(String[] args) {
	Function<Integer,Integer>f=n->n*n;
	System.out.println(f.apply(5));
	System.out.println(f.apply(9));
	System.out.println(f.apply(4));
	System.out.println(f.apply(7));

	
	Function<String,Integer>ff=str->str.length();
	System.out.println(ff.apply("sasi"));
	System.out.println(ff.apply("exception"));
	System.out.println(ff.apply("java"));
	}

}
