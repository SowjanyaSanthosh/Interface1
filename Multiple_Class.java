package com.org;

public class Multiple_Class implements  MultipleInterface1, MultipleInterface2 {
	@Override
	public void m2() {
		System.out.println("m2 method present in multiple interface2 and implemented in  Multiple_Class ");
		
	}

	@Override
	public void m1() {
		
		System.out.println("m1 method present in multiple interface1 and implemented in  Multiple_Class ");
	}
	 

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 Multiple_Class mc=new  Multiple_Class();
		 mc.m1();
		 mc.m2();

	}

	

}
