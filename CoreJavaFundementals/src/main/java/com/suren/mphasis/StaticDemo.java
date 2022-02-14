package com.suren.mphasis;

public class StaticDemo {

	int y =100;
	static int k =200;
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		StaticDemo st = new StaticDemo();
		st.y=400;
		//StaticDemo.k= 500;
		st.k=500;
		System.out.println(st.y);
		StaticDemo st1 = new StaticDemo();
		System.out.println(st1.y);
		System.out.println(st.k);
		

	}

}
