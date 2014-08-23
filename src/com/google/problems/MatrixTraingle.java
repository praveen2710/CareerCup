package com.google.problems;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class MatrixTraingle {
	
	private Set<Integer> nodes = new HashSet<Integer>();
	private int[][] adjMatrix;
	public void addNodes(int i){
		nodes.add(i);
	}
	
	public void createMatrix(){
		adjMatrix=new int[nodes.size()][nodes.size()];
	}
	public void addEdge(int i,int j){
		adjMatrix[i][j]=1;
		adjMatrix[j][i]=1;
	}
	public void displayMatrix(){
		for(int i=0;i<nodes.size();i++){
			for(int j=0;j<nodes.size();j++){
				System.out.print(adjMatrix[i][j]+" ");
			}
		System.out.println();
		}
	}
}
