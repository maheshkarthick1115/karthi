package com.polymorphism;

public class OverRiding1 extends  OverRiding{
	@Override
	public void studentname(String name) {
		super.studentname(name);
	}
	@Override
	public void studentmark(int cgpa, char percentage) {
		super.studentmark(cgpa, percentage);
	
	}
     @Override
    public void studentjoining(int date, int month, int year) {
    	super.studentjoining(date, month, year);
    }
     @Override
    public void studentclgfees(long amount) {
    	super.studentclgfees(amount);
    }
     public static void main(String[] args) {
    	 OverRiding1 k=new OverRiding1();
    	 k.studentname("karthick");
    	 k.studentmark(88, '%');
    	 k.studentjoining(11, 06, 2016);
    	 k.studentclgfees(1150999l);
    	 
		
	}
}
