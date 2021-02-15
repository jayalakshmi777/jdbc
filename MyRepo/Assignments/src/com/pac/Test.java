package com.pac;

public class Test implements Cloneable {
	int a=10;
	int b=20;
	public static void main(String[] args) throws CloneNotSupportedException {
		
		Test t = new Test();
		System.out.println(t.a);
		System.out.println(t.b);
		t.a=15;
		t.b=16;
		System.out.println(t.a);
		System.out.println(t.b);
		t.a=20;
		t.b=21;
		
		t.a=23;
		t.b=22;
		Test t1=(Test)t.clone();
		t.a=0;
		t.b=1;
		System.out.println(t1.a);
		System.out.println(t1.b);
		
		
		
	}

}
