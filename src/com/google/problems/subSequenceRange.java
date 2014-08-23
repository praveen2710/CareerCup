package com.google.problems;

public class subSequenceRange {
	
	public void numberOfSubsequence(int[] input){
		int min=7;
		int count=0;
		int[] b = new int[input.length];
		b[0]=input[0];
		for(int i=1;i<input.length;i++){
			b[i]=b[i-1]+input[i];
		}
		
		for(int i=0;i<input.length;i++){
			int j=i+1;
			while(j<input.length){
			if(b[j]- b[i] >=min){
				count++;
			}
			j++;
		}
		}
		System.out.println(count);
	}
	
}
