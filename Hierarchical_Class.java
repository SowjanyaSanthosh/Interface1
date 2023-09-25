package com.org;

public class Hierarchical_Class 
{
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Hierarchical_Class1 hc1=new Hierarchical_Class1 ();
		hc1.m1();
		Hierarchical_Class2 hc2=new Hierarchical_Class2();
		hc2.m1();
	}

	

}
class Hierarchical_Class1 implements Hierarchical_Interface
{

	@Override
	public void m1() {
		System.out.println("m1 method present in Hierarchical_Interface and implemented in Hierarchical_Class1  ");
		
	}
	
}
class Hierarchical_Class2 implements Hierarchical_Interface
{

	@Override
	public void m1() {
		System.out.println("m1 method present in Hierarchical_Interface and implemented in Hierarchical_Class2  ");
		
	}
	
}