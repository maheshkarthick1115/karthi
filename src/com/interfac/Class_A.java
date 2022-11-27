package com.interfac;

public class Class_A implements Company{
	@Override
	public void employeename() {
	System.out.println("karthick");
			}
	@Override
	public void employeeid() {
	System.out.println(12345);
		}
    @Override
	public void employeepassword() {
     System.out.println("karthick11234");		
	}
    @Override
	public void employeedetails() {
     System.out.println("112/D valasaravakkam chennai 600099");		
	}
    @Override
	public void employeedepartment() {
    System.out.println("production");		
	}
    @Override
	public void employeesalary() {
    System.out.println(150500);		
	}
    public static void main(String[] args) {
    	Class_A k=new Class_A();
    	k.employeename();
    	k.employeeid();
    	k.employeepassword();
    	k.employeedetails();
    	k.employeedepartment();
    	k.employeesalary();
	}
}
