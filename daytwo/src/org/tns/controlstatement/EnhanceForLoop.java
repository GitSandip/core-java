package org.tns.controlstatement;
import java.util.Iterator;
import java.util.Scanner;

public class EnhanceForLoop {
	int a;

	public static void main(String[] args) {
		
		
		Scanner sc = new Scanner(System.in);
		
		
		int[] arr = {1,3,4,2,6};
		for (int i : arr) {
			System.out.println(i);
		
		}
		
		//triangle pattern
		
		int n = sc.nextInt();
		
		for (int i = 1; i <= n; i++) {
			for(int j=1;j<=i;j++) {
				System.out.print(j);
			}
			System.out.println();
			
		}

	}

}
