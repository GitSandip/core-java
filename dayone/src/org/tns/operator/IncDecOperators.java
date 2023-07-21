package org.tns.operator;

public class IncDecOperators {

	public static void main(String[] args) {
		
		int x = 4;
		int y = 5;
		int res;
		
		//pre increment
		System.out.println(res = x++); //value of x is assign to res and then increment by 1
		
		//post increment
		System.out.println(res = ++y); //value of y is increment first then it assign to res
		
		//pre decrement
		System.out.println(res = x--); //value of x is assign to res and then decrement by 1
		
		//post decrement
		System.out.println(res = --y); //value of y is decrement first then it assign to res
		
		
		int a = 4;
		int b = 6;
		int result;
		
		result = --a + a++ + ++b * a;
		System.out.println(result);
		
	}

}
