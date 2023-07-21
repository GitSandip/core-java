package org.tns.operator;

public class BitwiseOperators {

	public static void main(String[] args) {
		
		byte a = 0b1001; // 8
		byte b = 0b0001; //1
		
		int x = 8;
		int y = 1;
		
		System.out.println(a & b);
		System.out.println(a | b);
		System.out.println(a ^ b);
		
		System.out.println("---------------------------------------------------");
		
		System.out.println(x & y);
		System.out.println(x | y);
		System.out.println(x ^ y);
		
		System.out.println("---------------------------------------------------");
		
		System.out.println(x << y);
		System.out.println(x >> y);

	}

}
