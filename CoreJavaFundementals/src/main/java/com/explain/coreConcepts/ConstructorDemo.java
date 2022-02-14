package com.explain.coreConcepts;

public class ConstructorDemo {
	
	int i;
	String name;
	
	public ConstructorDemo() {
		// TODO Auto-generated constructor stub
		this.i=i;
		this.name=name;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ConstructorDemo obj = new ConstructorDemo();
		System.out.println(obj.i); // 0
		System.out.println(obj.name); // null

	}

}
