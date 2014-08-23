package com.google.problems;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

/**
 * Needs working on a litlle more.
 * @author praveenbanthia
 *
 */
public class NextHighestNumber {
	
	public int nextHighest(int n){
		List<Integer> digits= new ArrayList<Integer>();
		int length = 0;
		int origOutput = n;
		while(n>0){
			digits.add(n%10);
			n /=10;
		}
		
		int swapPos1 = -1;
	  	for(int i = 0; i <=digits.size()-2 &&(swapPos1 == -1);i++){
	  		if(digits.get(i) >  digits.get(i+1))
	  			swapPos1 = i +1 ;
	  	}
	  	
	  	if (swapPos1 == -1) return origOutput;
	  	  
	  	int swapPos2 = -1;
	  	for(int i= 0 ;i<=swapPos1-1 &&(swapPos2 ==-1);i++){
	  		if(digits.get(i)>digits.get(swapPos1)){
	  			swapPos2=i;
	  		}
	  	}
	  	
	  	int digit1 = digits.get(swapPos1);
	  	int digit2 = digits.get(swapPos2);
	  	 digits.set(swapPos2, digit1);
	  	 digits.set(swapPos1, digit2);
	  
	  List<Integer> sortRemaining = digits.subList(swapPos2,swapPos1);
//	  System.out.println(sortRemaining);
	  Collections.sort(sortRemaining);
	  Collections.reverse(sortRemaining);
	  int newOutput=0;
	  for(int i=digits.size()-1;i>=0;i--){
		  newOutput = newOutput*10+digits.get(i);
	  }
	  return newOutput;
	}
}
