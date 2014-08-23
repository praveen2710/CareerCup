package com.google.problems;

public class NpositiveStringComparison {
	static void printRec(String str, int n){
		if(Integer.parseInt(str) > n)
			return;
		System.out.println(str);
		for(int i=0;i<10;i++)
			printRec(str+i,n);
	}
}
