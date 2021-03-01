package com.streams;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

class Student {
	 int sid;
	 char grade;
	 String name;
	 Student(int sid,String name,char grade){
		 this.grade=grade;
		 this.name=name;
		 this.sid=sid;
	 }
 }
public  class FlatMapExample{
public static void main(String[] args) {
	
	List<Student>l1=new ArrayList<Student>();
	l1.add(new Student(1, "jaya", 'A'));
	l1.add(new Student(2, "anu", 'A'));
	
	List<Student>l2=new ArrayList<Student>();
	l2.add(new Student(4, "aasi", 'A'));
	l2.add(new Student(3, "hani", 'A'));
	 
	List<List<Student>>ss=Arrays.asList(l1,l2);
	List<String>stu=ss.stream().flatMap(s->s.stream()).map(s->s.name).collect(Collectors.toList());
	System.out.println(stu);
}
}
