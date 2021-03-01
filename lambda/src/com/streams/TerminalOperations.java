package com.streams;

import java.util.Arrays;
import java.util.Comparator;
import java.util.HashSet;
import java.util.List;
import java.util.Optional;
import java.util.Set;
import java.util.stream.Collector;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class TerminalOperations {

	public static void main(String[] args) {
		List<Integer> ll = Arrays.asList(168, 8, 5, 63, 7, 5, 1, 0, 2, 9);
		// sorting normally
		List<Integer> sortedlist = ll.stream().sorted().collect(Collectors.toList());
		System.out.println(sortedlist);
		// sorting by comparator-reverse order
		ll.stream().sorted(Comparator.reverseOrder()).forEach(System.out::println);
		// set doesnot have Arrays.asList()
		Set<String> ss = new HashSet<>();
		ss.add("one tomato");
		ss.add("two	 tomato");
		ss.add("five tomato");
		ss.add("nine tomato");
		// allMatch()
		Boolean b = ss.stream().allMatch(value -> value.endsWith("tomato"));
		System.out.println(b);
		// anyMatch()
		Boolean bb = ss.stream().anyMatch(value -> {
			return value.startsWith("one");
		});
		System.out.println(bb);
		//nonMatch()
		boolean bbb=ss.stream().noneMatch(value->{
			return value.startsWith("one");
		});
		System.out.println(bbb);
		
		//findAny
		Optional<Integer>i=ll.stream().findAny();
		System.out.println(i.get());
		
		//findFirst
		Optional<String>str=ss.stream().findFirst();
		System.out.println(str);
		
		//concat the streams
		Set<String> ss2 = new HashSet<>();
		ss2.add("one tomato");
		ss2.add("two tomato");
		ss2.add("five tomato");
		ss2.add("nine tomato");
        ss2.stream();
        Set<String> ss3 = new HashSet<>();
		ss3.add("jaya");
		ss3.add("anu");
		ss3.add("pavi");
		ss3.add("nani");
		
        ss3.stream();
        
        Stream<String>s1= ss2.stream();
        Stream<String>s2= ss3.stream();
       List<String>finalstream=Stream.concat(s1, s2).collect(Collectors.toList());
       System.out.println(finalstream);
        
	}

}
