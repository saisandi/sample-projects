
package temperature_codingame;

import java.util.*;

public class solution {

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the number of tem values:");
		int result=0;
		int num_tem=sc.nextInt();
		ArrayList<Integer> temp_al=new ArrayList<Integer>();
		ArrayList<Integer> temp_al_pos=new ArrayList<Integer>();
		ArrayList<Integer> temp_al_neg=new ArrayList<Integer>();
		if(num_tem!=0) {
		for(int i=0;i<num_tem;i++) {
			int temp_value=sc.nextInt();
			temp_al.add(temp_value);
		}
		System.out.println("given values are:"+temp_al);
		for(int i=0;i<num_tem;i++) {
			if(temp_al.get(i)>0) {
				temp_al_pos.add(temp_al.get(i));
			}
			if(temp_al.get(i)<0) {
				temp_al_neg.add(temp_al.get(i));
			}
		}
		System.out.println("given positve values:"+temp_al_pos);
		System.out.println("given negative values:"+temp_al_neg);
		int min_value_pos=Collections.min(temp_al_pos);
		int min_value_neg=Collections.max(temp_al_neg);
		
		if(min_value_pos>Math.abs(min_value_neg)) {
			result=min_value_neg;
		}
		else {
			result=min_value_pos;
		}
		System.out.println("value near the zero is :" +result);
		}
		else {
			System.out.println(result);
		}
	}

}
