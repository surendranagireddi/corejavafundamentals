package com.explain.oopsConcepts;

class GrandFather {
	public void lotOfPreperty() {
		System.out.println("lot of preperty");
	}
}
class Father extends GrandFather{
	public void earnSomething() {
		System.out.println("earn something");
	}
}
class Child extends Father{
	public void whateverChildEarn() {
		System.out.println("what ever child earn");
	}
}

public class MultiLevelInheritance {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Child obj = new Child();
		obj.whateverChildEarn();
		obj.earnSomething();
		obj.lotOfPreperty();
	}

}
