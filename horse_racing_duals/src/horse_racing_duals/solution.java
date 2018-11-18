package horse_racing_duals;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class solution {

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the no.of.values");
		int n=sc.nextInt();
		System.out.println("enter the values:");
		int a[]=new int[n];
		for(int u=0;u<n;u++) {
			a[u]=sc.nextInt();
		}
		System.out.println("given numbers are");
		for(int u=0;u<n;u++) {
			System.out.print(a[u]+",");
		}
		System.out.println("");
		//main logic 
		ArrayList<Integer> al=new ArrayList<Integer>();
		for(int i=0;i<n;i++) {
			for(int j=i+1;j<n;j++) {
				if(a[i]>a[j]) {
					int d=a[i]-a[j];
					al.add(d);
				}
				if(a[j]>a[i]) {
					int d=a[j]-a[i];
					al.add(d);
					}
			}
		}
		System.out.println("difference between given no:"+al);
		System.out.println("min value in d_value:"+Collections.min(al));
	}
}
