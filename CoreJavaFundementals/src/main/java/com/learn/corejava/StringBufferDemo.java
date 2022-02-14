package com.learn.corejava;

public class StringBufferDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		StringBuffer sb = new StringBuffer("Mphasis");
		sb.append("The Next Applied");
		
		System.out.println(sb);
		
		String st = new String("Mphasis");
		st.concat("Next Applied");
		System.out.println(st);
		
		StringBuilder sbt =  new StringBuilder("Mphasis");
		sbt.append("Next append");
		System.out.println(sbt);
		

	}

}
