package com.explain.coreConcepts;

public class Student {
	Student(){     // no arg constructor
		
	}
	String name;
	int rollNo;
	Student(String name, int rollNo){
		this.name = name;
		this.rollNo= rollNo;
	}
	public static void main(String[] args) {
		Student stu = new Student("ram",100);
	}

}
