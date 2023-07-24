package org.tns.controlstatement;

import java.util.Scanner;

public class ElseIfStatement {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		float age1 = sc.nextInt();
		float age2 = sc.nextInt();
		float age3 = sc.nextInt();
		
		if( age1> age2 && age1>age3) {
			System.out.println("Age1 is greater");
		}
		else if(age2> age3) {
			System.out.println("Age2 is greater");
		}
		else {
			System.out.println("Age3 is greater");
		}
			

	}

}
