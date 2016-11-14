package com.OrgHrm.Functions;

public class BasicFunctions {

	public static void main(String[] args) 
	{
		function1();
		String res=function2();
		System.out.println(res);
		
		BasicFunctions fun=new BasicFunctions();
		
		fun.function3();
		boolean flag=fun.function4();
		System.out.println(flag);
		
		
		int result=fun.sum(30, 50);
		System.out.println(result);
	}
	
	//Static Function Without Returning any Value
	
	public static void function1()
	{
		System.out.println("This is Function1 code");
	}
	//Static Function With Returning Value
	
	public static String function2()
	{
		System.out.println("This is Functtion2 code");
		return "Pass";
	}
	
	//non static Function Without returning any value
	
	public void function3()
	{
		System.out.println("This is Function3 code ");
	}
	
	//Non Static Function with Returning value
	
	public boolean function4()
	{
		System.out.println("This is function4 code");
		return true;
	}
	public int sum(int a,int b)
	{
		int c=a+b;
		return c;
	}

}
