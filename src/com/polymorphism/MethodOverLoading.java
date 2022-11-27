package com.polymorphism;

public class MethodOverLoading {
	public void studentdetails(String name) {
		System.out.println("enter the student name:"+name);

	}
      public void studentdetails(int id) {
    	  System.out.println("enter the student id:"+id);

	}
     
      public void studentdetails(String college,long pincode ) {
    	  System.out.println("enter the student college name:" +college+","+pincode );

  	} 
      
   public static void main(String[] args) {
	   
	   MethodOverLoading k=new MethodOverLoading();
	   k.studentdetails("karthick");
	   k.studentdetails(59749);
	   k.studentdetails("NN university", 347842);
}
}
