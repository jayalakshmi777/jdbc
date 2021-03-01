package com.streams;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class MapDemo {
public static void main(String[] args) {
	//map
	Integer a[]= new Integer[]{1,23,33,5,9};
	List<Integer>ll=Arrays.asList(a);
	ll.stream().map(n->n%5).forEach(n->System.out.println(n));
	System.out.println("flashmap");
	//flatMap
	List<Integer>l1=Arrays.asList(1,2);
	List<Integer>l2=Arrays.asList(5,5);
	List<Integer>l3=Arrays.asList(9,6);
	List<List<Integer>>finalist=Arrays.asList(l1,l2,l3);
	finalist.stream().flatMap(n->n.stream()).forEach(System.out::print);
	List<Integer>fl=finalist.stream().flatMap(n->n.stream()).collect(Collectors.toList());
	System.out.println(fl);
	
	//we can apply operations on the flatmap
	finalist.stream().flatMap(x->x.stream()).map(x->x+2).forEach(System.out::print);
	
	
}
}
