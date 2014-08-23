package com.google.problems;

import java.util.ArrayList;
import java.util.List;

/**
 * THis class should generate all numbers meething the requirements The next digit should be greater
 * than the previous example 123,234 this is part of another subproblem so only consecutive so
 * examples like 137 is invalid.
 * 
 * @author praveenbanthia
 *
 */
public class IncreasingNumbers {
  
 
  String currentNumber="";
  List<String> NumberSet = new ArrayList<String>();
  /**
   * 
   * @param i the integer whose all valid numbers are to be genrated
   * @return a set of integers with all valid numbers
   */
  public List<String> numberGenerator(String i){
    int endDigit=9;
    String digitToAdd = i;
    NumberSet.add(numberGeneratorHelper(digitToAdd, currentNumber));
    currentNumber=currentNumber+i;
    int digit=Integer.parseInt(i);
    if((digit==endDigit)){
      endDigit--;
      return NumberSet;
    }
    else{
      digit+=1;
      String nextDigitToAdd = Integer.toString(digit); 
      numberGenerator(nextDigitToAdd);
    }
    return NumberSet;
  }
  
  public String numberGeneratorHelper(String digitToAdd,String number){
    return number+digitToAdd;
  }
  
  
 
  
  public static void main(String args[]){
    IncreasingNumbers in =  new IncreasingNumbers();
    List<Integer> allValidNumbers = new ArrayList<Integer>();
    List<String> a =in.numberGenerator("2");
    for(String s:a){
      System.out.println(s);
    }
  }
}
