package com.Method_overloadindScnrois;

public class Scerio1 
{
	
	public void m1(int a)
	{
		System.out.println("Primitive int method");
	}
	
	/*public void m1(float a)
	{
		System.out.println(" float method");
	}*/
	
	public void m1(char a)
	{
		System.out.println("char  method");
	}
/*	public void m1(Integer a)
	{
		System.out.println("Wrapper  method");
	}*/
	/*public void m1(Number a)
	{
		System.out.println("Wrapper parent  method");
	}*/
	public void m1(Object a)
	{
		System.out.println("Object class  method");
	}


	public static void main(String[] args) {
		// TODO Auto-generated method stub
    Scerio1 s=new Scerio1();
    s.m1('a');
	}

}
