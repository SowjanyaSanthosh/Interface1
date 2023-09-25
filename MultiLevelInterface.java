package com.org;

public interface MultiLevelInterface {
	public void m1();

}
interface MultiLevelInterface1 extends MultiLevelInterface  {
	public void m2();
}
interface MultiLevelInterface2 extends MultiLevelInterface1{
	public void m3();
}