package com.explain.oopsConcepts;

class Demo{ // child parent concepts // Is a relationship.
	public void test() {
		System.out.println("Hi");
	}
}

// Is-A Relationship
public class InheritanceDemo1 extends Demo {
	public static void main(String[] args) {
		InheritanceDemo1 obj = new InheritanceDemo1();
		obj.test();
		obj.dispaly();
	}
	public void dispaly() {
		System.out.println("Bye");
	}

}
