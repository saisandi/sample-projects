package project_reverse_name;

import java.util.Scanner;

public class piramid {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("enter how many rows:");
		Scanner sc=new Scanner(System.in);
		int rows=sc.nextInt();
		//to get no.of lines
		for(int i=1;i<=rows;i++) {
			//to get no.of spaces
			for(int j=rows;j>i;j--) {
				System.out.print(" ");
			}
			//to print piramid * with space
			for(int k=0;k<i;k++) {
				System.out.print("* ");
			}
			System.out.println("");
		}

	}

}
