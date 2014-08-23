package com.google.problems;

/**
 * 	
 * 
 * @author praveenbanthia
 */
public class inPlaceSpaceRemoval {
	
	public void removeSpace(String str){
		char[] input = str.toCharArray();
		int i=0;
		int j=i;
		boolean head =false;
		boolean isSpace=false;
		for(i=0;i<input.length;++i){
			if(!head && input[i]==' '){
				continue;
			}
			head = true;
			if(input[i]!=' '){
				input[j++]=input[i];
				isSpace=false;
			}else{
				if(!isSpace){
					input[j++]=input[i];
				}
				isSpace=true;
			}
		}
		for(int k=0;k<input.length;k++){
			System.out.print(input[k]);
		}
	}
	
}
