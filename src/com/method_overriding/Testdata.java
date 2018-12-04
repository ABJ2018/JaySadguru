package com.method_overriding;

 class parent 
{

	 public void m1()
		{
			System.out.println("m1 parent");
		}	
	public  Number m2()
	{
		System.out.println("m2 parent");
		return null;
	}
	public static void m3()
	{
		System.out.println("m3 parent");
	}
	public final void m4()
	{
		System.out.println("m4 parent");
	}
}
class child extends parent
{
	public void m1()
	{
		System.out.println("m1 child");
	}	
	public  Number m2()
	{
		System.out.println("m2 child");
		return null;
	}
	
	public static void m3()
	{
		System.out.println("m3 child");
	}
	
}
public class Testdata
{
	public static void main(String[] args)
	{
		child c=new child();
		c.m1();
		c.m2();
		c.m3();
		
		parent p=new child();
		p.m1();
		p.m2();
		p.m3();
		p.m4();
		
		
	}
	}



/*
 * 
 * output
 * m1 child
m2 child
m3 child
m1 child-instance method parent
m2 child-instance method parent
m3 parent
m4 parent
 * 
 * 
 * 
 * */
 