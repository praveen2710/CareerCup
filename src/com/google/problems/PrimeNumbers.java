package com.google.problems;

import java.util.ArrayList;
import java.util.List;

public class PrimeNumbers {

	List<Integer> firstFivePrimesWithTenDigits(){
		List<Integer> knownPrimes = new ArrayList<Integer>();
		knownPrimes.add(2);
		knownPrimes.add(3);
		List<Integer> bigPrimes = new ArrayList<Integer>();
		for(int i=101;bigPrimes.size()<5;i+=2){
			if(isPrime(i,knownPrimes)){
				bigPrimes.add(i);
			}
		}
		return bigPrimes;
	}
	
	boolean isPrime(int n,List<Integer> knownPrimes){
		int squareRoot = (int)Math.sqrt(n);
				//last known prime number
		while(knownPrimes.get(knownPrimes.size()-1)<squareRoot){
			addNextPrime(knownPrimes);
		}
		for(int i=0;i<knownPrimes.size();i++){
			int prime = knownPrimes.get(i);
			if(n%prime==0){
				return false;
			}
			if(prime >= squareRoot){
				break;
			}
			
		}
		return true;
	}
	
	void addNextPrime(List<Integer> knownPrimes){
		for(int i=knownPrimes.get(knownPrimes.size()-1)+2;true;i+=2){
			if(isPrime(i,knownPrimes)){
				knownPrimes.add(i);
				return;
			}
		}
	}
}

