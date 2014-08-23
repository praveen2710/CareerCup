package com.google.problems;

public class longestSubString {
	public String longestPrefix(String s){
		String[] words = s.split("");
		int prefixLength = words[0].length();
		
		for(int i=1;i<words.length;i++){
			if(prefixLength > words[i].length())
				prefixLength = words[i].length();
			for(int j=0;j<Math.min(prefixLength,words[i].length());j++){
				if(words[i].charAt(j)!=words[0].charAt(j)){
					prefixLength=j;
					break;
				}
			}
		}
		return s.substring(0,prefixLength);
	}
}
