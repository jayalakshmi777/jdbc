package net;

public class Employee {
	int Employeeid;
    String Employeename;
    double Employeesalary;
	public int getEmployeeid() {
		return Employeeid;
	}
	public void setEmployeeid(int employeeid) {
		Employeeid = employeeid;
	}
	public String getEmployeename() {
		return Employeename;
	}
	public void setEmployeename(String employeename) {
		Employeename = employeename;
	}
	public double getEmployeesalary() {
		return Employeesalary;
	}
	public void setEmployeesalary(double employeesalary) {
		Employeesalary = employeesalary;
	}
	public Employee(int employeeid, String employeename, double employeesalary) {
		super();
		Employeeid = employeeid;
		Employeename = employeename;
		Employeesalary = employeesalary;
	}
}
