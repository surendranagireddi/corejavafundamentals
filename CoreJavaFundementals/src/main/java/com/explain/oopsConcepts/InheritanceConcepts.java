package com.explain.oopsConcepts;

class People{ //super class  Parent class 
	public void work() {
		System.out.println("working");
	}
}
class Villagers extends People{ // Child class //sub classs
	public void display() {
		System.out.println("displaying");
	}
}

public class InheritanceConcepts {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Villagers villObj = new Villagers();
		villObj.display();
		villObj.work();
	}

}
