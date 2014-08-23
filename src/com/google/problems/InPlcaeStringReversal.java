package com.google.problems;

public class InPlcaeStringReversal {
	public char[] StringINPlace(char[] string){
		
		for(int i=0,j=string.length-1;i<=j;i++,j--){
			char c = string[i];
			string[i]=string[j];
			string[j]=c;
		}
	return string;
	}
}
