package com.google.problems;

import java.util.List;

public class SnakeGame {
	public void findWord(char[][] inputArray,String wordToSearch){
		char[] givenWord = wordToSearch.toCharArray();
		int countOfMatches = 0;
		
		for(int row=0;row<inputArray.length;row++)
			for(int col=0;col<inputArray[row].length;col++){
				int startChar = 0;
				if(givenWord[startChar]==inputArray[row][col]){
					countOfMatches +=findWord(inputArray,givenWord,row,col,startChar+1);
				}
			}
		System.out.println(String.format("Found the word: %s %d times", 
				wordToSearch, countOfMatches));
	}

	private int findWord(char[][] inputArray, char[] wordToSearch, int row,
			int col, int startChar) {
		if(startChar<wordToSearch.length){
			int result=0;
			//search left to right
			int[] newIndex= new int[]{row,col+1};
			if(newIndex[1]<inputArray[col].length && wordToSearch[startChar]==inputArray[newIndex[0]][newIndex[1]]){
				result+= findWord(inputArray,wordToSearch,newIndex[0],newIndex[1],startChar+1);
			}
			//search top to bottom
			newIndex[0]=row;
			newIndex[1]=col;
			newIndex = new int[]{row+1,col};
			if(newIndex[0]<inputArray.length&& wordToSearch[startChar]==inputArray[newIndex[0]][newIndex[1]]){
				result+=findWord(inputArray,wordToSearch,newIndex[0],newIndex[1],startChar+1);
			}
			//search right to left
			newIndex[0]=row;
			newIndex[1]=col;
			newIndex=new int[]{row,col-1};
			if(newIndex[1]>=0&&newIndex[1]<inputArray.length&& wordToSearch[startChar]==inputArray[newIndex[0]][newIndex[1]]){
				result+=findWord(inputArray,wordToSearch,newIndex[0],newIndex[1],startChar+1);
			}
			//search botton to top
			newIndex[0]=row;
			newIndex[1]=col;
			newIndex=new int[]{row-1,col};
			if(newIndex[0]>=0&&newIndex[0]<inputArray.length&& wordToSearch[startChar]==inputArray[newIndex[0]][newIndex[1]]){
				result+=findWord(inputArray,wordToSearch,newIndex[0],newIndex[1],startChar+1);
			}
			return result;
		}else
		return 1;
	}
}
