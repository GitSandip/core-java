package org.tns.controlstatement;

import java.util.Scanner;

public class NestedIf {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		float age = sc.nextInt();
		float weight = sc.nextInt();
		
		if(age>= 12) {
			if(weight >= 40) {
				System.out.println("Eligible for bunjee jumping");
				if(weight > 130){
					System.out.println("More weight is added");
				}
			}
			
		}
		else {
			System.out.println("Not eligible for bunjee jumping");
		}
		
		

	}

}
