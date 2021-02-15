package com.lambda;

import java.util.ArrayList;
import java.util.function.Function;

public class Student {
int sid;
String sname;
double fee;
Student(int id,String name,double fee){
	this.sid=id;
	this.sname=name;
	this.fee=fee;
}
public static void main(String[] args) {
	ArrayList<Student>s=new ArrayList<>();
	s.add(new Student(1, "latha", 2500));
	s.add(new Student(2, "vani", 3500));
	s.add(new Student(3, "pushpa", 7800));
	s.add(new Student(4, "kasi", 9000));
	Function<Student,Double>f=stu->{
	double fee=stu.fee;
	if(fee<=2500) {
		return fee*10/100;
	}else if(fee>3500&&fee<2500) {
		return fee*15/100;
	}
	return fee*20/100;
		
	};

for(Student ss:s) {
	System.out.println(f.apply(ss));
	System.out.println(ss.sname);
}
}
}
