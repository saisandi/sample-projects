package project_reverse_name;

import java.util.Scanner;

public class reversestring {
	public static void main(String[] arg) {
		System.out.println("enter the string : ");
		Scanner sc=new Scanner(System.in);
		String name=sc.nextLine();
		char[] name_ch=name.toCharArray();
		for(int i=name.length()-1;i>=0;i--) {
			System.out.print(name_ch[i]);
		}
		
	}

}
