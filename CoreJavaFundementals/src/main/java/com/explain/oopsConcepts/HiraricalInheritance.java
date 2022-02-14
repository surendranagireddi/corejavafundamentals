package com.explain.oopsConcepts;

class Animal{
	public void speak() {
		System.out.println("Speeking");
	}
	
}
class Dog extends Animal{
	public void bark() {
		System.out.println("barking");
	}
}
class Cat extends Animal{
	public void mewmew() {
		System.out.println("Mew Mew");
	}
	
}

public class HiraricalInheritance {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Dog dogobj = new Dog();
		dogobj.speak();
		dogobj.bark();
		
		Cat catobj = new Cat();
		catobj.speak();
		catobj.mewmew();
	}

}
