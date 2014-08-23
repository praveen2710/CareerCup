package com.google.problems;

import java.util.ArrayList;
import java.util.List;

public class ArrayHopperProblem {
 public List<Integer> hopper(int[] array){

	 List<Integer> setOfSolution = new ArrayList<Integer>();
	 int size = array.length; 
	 setOfSolution.add(array[0]);
	
	 int start = 0;
	 int movement = array[0];
	 int remaining = size-array[0];

//	 for(int i = 0;i<size;i++){
//		int  movement = array[i];
//		if(movement>size-i)
//			break;
//		int max =0;
//		 for(int j=i;j<=movement;j++){
//			 if(max<array[j]){
//				 max=array[j];
//				 i = j;
//			 } 
//		 }
//		 setOfSolution.add(array[i]);
//	 }
	 return setOfSolution;
 }
 
 public int MinSteps(vector<int> vecNum)
 {
 	int size = vecNum.size();
 	vector<int> vecSteps(size);
 	vecSteps[0] = 0;
 	for (int i = 1; i < size; i++)
 	{
 		int min = i;

 		for (int j = 0; j < i; j++)
 		{
 			if (i - j <= vecNum[j])
 			{
 				if (min > vecSteps[j] + 1)
 					min = vecSteps[j] + 1;
 			}
 		}

 		vecSteps[i] = min;
 	}
 	return vecSteps[size - 1];
 }
}
}