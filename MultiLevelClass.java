package com.org;

public class MultiLevelClass implements MultiLevelInterface2{
	@Override
	public void m2() {
		System.out.println("m2 method present multilevel interface1 and implemented in multilevel class");
		
	}

	@Override
	public void m1() {
		System.out.println("m1 method present multileve1 interface and implemented in multilevel class");
		
	}

	@Override
	public void m3() {
		System.out.println("m3 method present multileven interface2 and implemented in multilevel class");
		
	}

	public static void main(String[] args) {
		MultiLevelClass mc=new MultiLevelClass();
		mc.m1();
		mc.m2();
		mc.m3();

	}

	

}
