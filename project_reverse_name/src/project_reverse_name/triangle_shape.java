package project_reverse_name;

import java.util.Scanner;

public class triangle_shape {

	public static void main(String[] args) {
		System.out.println("enter how many rows:");
		Scanner sc=new Scanner(System.in);
		int rows=sc.nextInt();
		for(int i=1;i<=rows;i++) {
			for(int j=0;j<i;j++) {
				System.out.print("*");
			}
			System.out.println("");
		}

	}

}
