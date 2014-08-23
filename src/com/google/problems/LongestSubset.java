package com.google.problems;

public class LongestSubset {

	public int eachSubsetSize(int[][] inputArray){

		int count=0;
		int startNumber=0;
		for(int row=0;row<inputArray.length;row++)
			for(int col=0;col<inputArray[row].length;col++){
				int tempCount =1;
				tempCount = nextNumber(inputArray,inputArray[row][col],row,col,tempCount);
				if(tempCount>count){
					count=tempCount;
					startNumber=inputArray[row][col];
				}
		}
		System.out.println("StartNumber is "+startNumber);
		return count;
	}
	
	private int nextNumber(int[][] inputArray,int number,int row,int col,int Count){
		
//		if(row!=inputArray.length&&col!=inputArray[inputArray.length][inputArray[inputArray.length].length]){
			//go left to rigth
//		int tempCounter=1;
			int[] startIndex = new int[]{row,col+1};
			if(startIndex[1]<inputArray[row].length && inputArray[startIndex[0]][startIndex[1]]==number+1){
//				Count++;
				Count=nextNumber(inputArray,number+1,startIndex[0],startIndex[1],Count+1);
			}
			startIndex[0]=row;
			startIndex[1]=col;
			startIndex = new int[]{row+1,col};
			if(startIndex[0]<inputArray.length && inputArray[startIndex[0]][startIndex[1]]==number+1){
//				Count++;
				Count=nextNumber(inputArray,number+1,startIndex[0],startIndex[1],Count+1);
			}
			
			startIndex[0]=row;
			startIndex[1]=col;
			startIndex = new int[]{row,col-1};
			if(startIndex[1]>=0&&startIndex[0]<inputArray[row].length && inputArray[startIndex[0]][startIndex[1]]==number+1){
//				Count++;
				Count=nextNumber(inputArray,number+1,startIndex[0],startIndex[1],Count+1);
			}
			
			startIndex[0]=row;
			startIndex[1]=col;
			startIndex = new int[]{row-1,col};
			if(startIndex[0]>=0&&startIndex[0]<inputArray.length && inputArray[startIndex[0]][startIndex[1]]==number+1){
//				Count++;
				Count=nextNumber(inputArray,number+1,startIndex[0],startIndex[1],Count+1);
			}
//		}
		return Count;
		
	}


}
