package com.google.problems;

import java.util.ArrayList;

public class ReplaceString {
	
	public ArrayList<String> replace(String target){
		return replaceHelper(target,target.length()-1);
	}

	private ArrayList<String> replaceHelper(String target, int to) {
		char c = target.charAt(to);
		if(to==0){
			ArrayList<String> res= new ArrayList<String>();
			if(c=='?'){
				res.add("0");
				res.add("1");
			}
			else{
				res.add(c+" ");
			}
			return res;
		}
		ArrayList<String> res = new ArrayList<String>();
		ArrayList<String> preRes = replaceHelper(target,to-1);
		if(c=='?'){
			for(String token:preRes){
				res.add(token+"0");
				res.add(token+"1");
			}
		}
		else{
			for(String token:preRes){
				res.add(token+c);
			}
		}
		return res;
	}
}
