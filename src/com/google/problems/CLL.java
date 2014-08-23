package com.google.problems;

import java.util.ArrayList;
import java.util.List;

public class CLL {
	static int size;
	static IntNode head;
	IntNode current;
	
	
	public CLL(){
		size=0;
		head=null;
	}
	
	
	public int posToInsert(int a){
		IntNode newNode = new IntNode(a);
		size++;
		IntNode currNode = head;
		int pos=0;
		while(pos<size){
			if(head==null){
				head = new IntNode(newNode.getData());
				head = newNode;
				pos++;
			}else{
				IntNode nextNode = new IntNode();
				if(newNode.getData()>currNode.getData() && newNode.getData()<nextNode.getData()){
					IntNode temp = new IntNode();
					temp = currNode.getNextNode();
					currNode.setNextNode(newNode);
					newNode.setNextNode(temp);
				}else{
					//need to work on
					currNode = currNode.getNextNode();
					nextNode = currNode.getNextNode()
					pos++;
				}
			}
		}
		return pos;
	}
}
