package com.org;

public class SingleLevelClass implements SingleLevel {
	@Override
	public void m1() {
		System.out.println("m1 method is implemented in single level class");
	}

	@Override
	public void m2() {
		System.out.println("m2 method is implemented in single level class");
		
	}


	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SingleLevelClass s1=new SingleLevelClass();
		s1.m1();
		s1.m2();

	}

	
}
