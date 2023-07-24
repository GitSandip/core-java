package org.tns.controlstatement;

import java.util.Scanner;

public class SwitchExecutor {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		

		System.out.println("Enter song number");
		int songNumber = sc.nextInt();
		
		switch(songNumber) {
		case 1:
			System.out.println("Awara sham hai");
			break;
			
		case 2:
			System.out.println("Waka waka");
			break;
			
		default:
			System.out.println("invalid input");
			
		}
		
		
		

	}

}
