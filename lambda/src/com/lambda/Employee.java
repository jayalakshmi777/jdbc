package com.lambda;

import java.util.ArrayList;
import java.util.function.Predicate;

public class Employee {
int eid;
String ename;
double esalary;
Employee(int id,String name,double sal){
	eid=id;
	ename=name;
	esalary=sal;
}
public static void main(String[] args) {
	ArrayList<Employee>e=new ArrayList<>();
	e.add(new Employee(1, "jaya", 350000));
	e.add(new Employee(2, "anu", 50000));
	e.add(new Employee(3, "kumar", 100000));
	e.add(new Employee(4, "janu", 3000));
	Predicate<Employee>pr1=i->(i.esalary>20000);
	Predicate<Employee>pr2=i->(i.ename.startsWith("j"));
	for(Employee ee:e) {
		if(pr1.negate() ==ee) {
			System.out.println("name is "+ee.ename);
		}
	}
}
}
