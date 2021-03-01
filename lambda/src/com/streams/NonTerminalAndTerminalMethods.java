package com.streams;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

public class NonTerminalAndTerminalMethods {
	public static void main(String[] args) {
		List<Integer> al = Arrays.asList(1,2,3,4,5,6,7);
		//toArray
		Object []arr=al.stream().toArray();
		System.out.println(arr.length);
		for(Object ar:arr) {
			System.out.println("value"+ar);
		}		
		//reduce
		Optional<Integer> reducedvalue=al.stream().reduce((firstvalue,secondvalue)->{
			return firstvalue+secondvalue;
		});
		System.out.println("reduce value is"+reducedvalue.get());
		// min
		 Optional<Integer> min=al.stream().min((a, b) -> {
			return a.compareTo(b);
		});
		 
		 //max
		Optional<Integer>max= al.stream().max((x,y)->{
			 return x.compareTo(y);
		 });
		 System.out.println("min value is  "+min.get());
		 System.out.println("min value is  "+max.get());
		 
		// distinct-non terminal
		List<Integer> values = al.stream().distinct().collect(Collectors.toList());
		System.out.println(values);// [1, 2, 4, 5] removes duplicates
		
		// count-terminal method
		long count = al.stream().distinct().count();

		System.out.println(count + count);
		// limit-non terminal
		al.stream().limit(2).forEach(x -> System.out.println("limited values" + x));

	}
}
