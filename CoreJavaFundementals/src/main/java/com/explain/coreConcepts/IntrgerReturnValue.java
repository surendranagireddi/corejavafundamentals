package com.explain.coreConcepts;

public class IntrgerReturnValue {
	public static void main(String[] args) {
		IntrgerReturnValue obj = new IntrgerReturnValue();
		int addValue =obj.add();
		System.out.println(addValue);
		
		
	}
	public int add(){
		int  i=10;
		int j =20;
		int k =i+j;
		return  k;
		
	}

}
