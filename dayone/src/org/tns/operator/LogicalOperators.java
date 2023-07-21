package org.tns.operator;

public class LogicalOperators {

	public static void main(String[] args) {
		
		System.out.println(1<2 && 2 == 3);
		
		System.out.println(1<2 || 2 == 3);
		
		String s = "sandip";
		String d = "sandip";
		
		System.out.println(s == d);
		
		// Assignment operators
		int x =10;
		
		System.out.println(x += 3);
		
		System.out.println(x += 3*4*x);
		
		int a = 12,b=10;
		a-=b;
		System.out.println(a);
		
		

	}

}
