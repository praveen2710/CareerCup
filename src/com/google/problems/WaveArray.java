package com.google.problems;

public class WaveArray {
	public int[] waveArray(int[] input){
		for(int i=0;i<input.length-1;i++){
			if(i%2==0 && input[i]<input[i+1]){
				int c = input[i];
				input[i] = input[i+1];
				input[i+1] = c;
			}
		}
		return input;
	}

}
