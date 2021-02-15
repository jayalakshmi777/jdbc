package com.streams;

import java.util.ArrayList;
import java.util.stream.Collectors;

public class FilterDemo {
public static void main(String[] args) {
	ArrayList<String>al=new ArrayList<>();
	al.add("saikiran");
	al.add("umesh");
	al.add("karthikeya");
	al.add("lalitha");
	al.add("sameer");
	al.stream().filter(str->str.length()>3&&str.length()<=6).forEach(str->System.out.println(str));

	
}
}
