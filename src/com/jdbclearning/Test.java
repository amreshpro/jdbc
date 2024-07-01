package com.jdbclearning;


public class Test {

	public static void main(String[] args) throws ClassNotFoundException {
		// TODO Auto-generated method stub
		
//		new Demo();
		Class.forName("Demo");

	}

}


class Demo{
	
	
	static {
		System.out.println("static block");
	}
	
	
	{
		System.out.println("Instance block");
	}
}