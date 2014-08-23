package com.google.problems;

public class maxRectangle {
	
	public int maxRectangle(int[][] input){

		int maxArea=0;
		for(int i=0;i<input.length;i++){
			for(int j=0;j<input[i].length;j++){
				int length=0;
				int breadth=0;
				if(input[i][j] == 1){
						 length =checkLength(i,j,input,length);
						 breadth = checkBreadth(i,j,input,breadth);
						 System.out.println(length+"length");
						 System.out.println(breadth+"breath");
				}
				if(maxArea<length*breadth){
				maxArea=length*breadth;
				}
				}
		}
		return maxArea;
	}
	
	public int checkLength(int i,int j,int[][] input,int length){
		if(i+1<input.length&&j+1<input[i].length&&input[i][j+1]==1){
			length=checkLength(i,j+1,input,length);
		}
		length++;
		return length;
	}
	
	public int checkBreadth(int i,int j,int[][] input,int breadth){
		if(i+1<input.length&&j+1<input[i].length&&input[i+1][j]==1){
			breadth=checkBreadth(i+1,j,input,breadth);
		}
		breadth++;
		return breadth;
	}
}
