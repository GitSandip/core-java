package org.tns.intro;
import java.util.Scanner;

public class CompilerInput {

	public static void main(String[] args) {
		// demonstrate compile time input
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter input String :");
		String str = sc.next();
		System.out.println("output : "+str);

	}

}
