package com.klkgroup;

import java.util.*;

public class solution {

	public static void main(String[] args) {
		
	List<String> names=new ArrayList<String>();
	names.add("sai");
	names.add("sandi");
	names.add("sai");
	names.add("chinna");
	System.out.println(names);
	List<String> new_name=new ArrayList<String>();
	for(String s: names) {
		if(!new_name.contains(s)) {
		new_name.add(s);
		}
	}
	System.out.println(new_name);

	}

}
