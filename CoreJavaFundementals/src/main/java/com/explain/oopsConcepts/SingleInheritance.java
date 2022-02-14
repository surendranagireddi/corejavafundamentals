package com.explain.oopsConcepts;

class AAAA{
	public void test() {
		System.out.println("AAAA");
	}
}
class BBBB extends AAAA{
	public void display() {
		System.out.println("BBBB");
	}
}
public class SingleInheritance {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		BBBB obj = new BBBB();
//		obj.display();
//		obj.test();

		BBBB obj =  new BBBB();
		AAAA obj2 = new BBBB();
		obj2.test();
	// BBBB ob = new AAAA();
		
	}

}
