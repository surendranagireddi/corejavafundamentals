package com.explain.coreConcepts;

public class StaticIntReturn {
	public static void main(String[] args) {
		
		int value = add();
		System.out.println(value);
	}
	static int  add() {
		
		int i =10;
		int j =20;
		int k =i+j;
		return k;
	}

}
