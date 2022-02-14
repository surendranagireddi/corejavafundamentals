package com.explain.oopsConcepts;


class ParentDemo{
	public void look() {
		System.out.println("parent is looking");
	}
	
}
class ChildDemo extends ParentDemo{
	public void study() {
		System.out.println("Studyiing");
	}
}
public class InheritanceDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ChildDemo  childobj = new ChildDemo();
		childobj.study();
		childobj.look();
	}

}
