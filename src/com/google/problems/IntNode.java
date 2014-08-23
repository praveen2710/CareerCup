package com.google.problems;

public class IntNode {
	private int data;
	private IntNode next;
	
	public IntNode(){
		this.data =Integer.MAX_VALUE;
		this.next = null;
	}
	public IntNode(int a){
		this.data =a;
		this.next = null;
	}
	
	public int getData(){
		return data;
	}
	
	public IntNode getNextNode(){
		return next;
	}
	
	public void setData(int a){
		this.data = a;
	}
	
	public void setNextNode(IntNode next){
		this.next = next;
	}
}

