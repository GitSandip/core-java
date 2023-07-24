package org.tns.controlstatement;
import java.util.Scanner;

public class ControlStatement {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		float age = sc.nextInt();
		float weight = sc.nextInt();
		
		if(age > 18 && weight >50) {
			System.out.println("Eligigble for blood donatation");
		}
		else {
			System.out.println("Not eligible");
		}
		
		sc.close();

	}

}
