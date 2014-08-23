package com.google.problems;

import java.util.ArrayList;
import java.util.List;

public class Permutation {

	public List<String> permutations(int size){
		if(size==1){
			List<String> after = new ArrayList<String>();
			after.add("0");
			after.add("1");
			return after;
		}
		
		List<String> after= new ArrayList<String>();
		List<String> before = permutations(size-1);
		
		for(String i : before){
			after.add(i+"0");
			after.add(i+"1");
		}
		return after;
	}
}
