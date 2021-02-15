package com.pac;

import java.util.Scanner;

public class Calculations {
public static void insertOperator() {
	Scanner sc=new Scanner(System.in);
	System.out.println("enter the values");
	double a = sc.nextDouble();
    double b = sc.nextDouble();
System.out.println("enter operators");
char operator= sc.next().charAt(0);
double result;
switch(operator) {
case'+':
	result=a+b;
	System.out.println("the result is" +result);
	break;
case'-':
	result=a-b;
	System.out.println("the result is" +result);
	break;
case'/':
	result=a/b;
	System.out.println("the result is" +result);
	break;
case'*':
	result=a*b;
	System.out.println("the result is" +result);
	break;
case'%':
	result=a%b;
	System.out.println("the result is" +result);
	break;
}
	
}
public static void main(String[] args) {
	insertOperator();
}
}
