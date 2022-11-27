package com.abstraction;

public class Child extends Parent{

	@Override
	public void employeepassword() {
		System.out.println(150911);
		
	}

	@Override
	public void employeesalary() {
	System.out.println(125000);
		
	}

	@Override
	public void employeeshift() {
	 System.out.println("second shift");
		
	}
	public static void main(String[] args) {
		Child k=new Child();
		k.employeename();
		k.employeeid();
		k.employeepassword();
		k.employeesalary();
		k.employeeage();
		k.employeeshift();
		k.employeedetails();
	}

	@Override
	public void madd() {
		// TODO Auto-generated method stub
		
	}

	
		
	

}
