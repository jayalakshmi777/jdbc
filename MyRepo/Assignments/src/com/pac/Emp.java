package com.pac;

import java.nio.charset.MalformedInputException;

public class Emp {
private int eid;
private String ename;
public Emp(int eid, String ename) {
	super();
	this.eid = eid;
	this.ename = ename;

}

public static void main(String[] args) {
	Emp emp=new Emp(1,"jau");
	Emp emp1=new Emp(1,"jau");
	Emp emp3=new Emp(1,"jau");
	

}
@Override
public String toString() {
	return "Emp [eid=" + eid + ", ename=" + ename + "]";
}



}
