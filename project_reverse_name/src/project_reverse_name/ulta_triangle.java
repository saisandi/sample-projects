package project_reverse_name;

import java.util.Scanner;

public class ulta_triangle {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("enter how many rows:");
		Scanner sc=new Scanner(System.in);
		int rows=sc.nextInt();
		//to get no.of lines
		for(int i=1;i<=rows;i++) {
			//to print spaces 
			for(int k=1;k<i;k++) {
				System.out.print(" ");
			}
			//to get no.of * and decrease
			for(int j=rows;j>=i;j--) {
				System.out.print("*");
			}
			
			System.out.println("");
		}

	}

}
