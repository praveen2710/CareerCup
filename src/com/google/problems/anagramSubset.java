package com.google.problems;

import java.util.HashMap;
import java.util.Map;

public class anagramSubset {
	static Map<String,Integer> aToZ=  new HashMap<String,Integer>();
	
	public void checkString(String src, String target){
		if(src.length()>target.length()){
			System.out.println("NOt correct");
		}
		 
		int srcCount[] = new int[128];
		int targetCount[] = new int[128];
		
		for(int i=0;i<target.length();i++){
			targetCount[i]=(int)target.charAt(i);
		}
		
		int srcSum=0;
		for(int i=0;i<src.length();i++){
			srcCount[i]=(int)src.charAt(i);
			srcSum+=srcCount[i];
		}
	
		for(int i=0;i<target.length()-src.length();i++){
			int targetSubSum=0;
			for(int j=i;j<i+src.length();j++){
				targetSubSum+=targetCount[j];
			}
			if(targetSubSum==srcSum)
				System.out.println("Match Found");
		}
		System.out.println("Loop Ended");
	}
}
