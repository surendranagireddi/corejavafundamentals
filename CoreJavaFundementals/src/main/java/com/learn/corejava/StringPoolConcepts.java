package com.learn.corejava;

public class StringPoolConcepts {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String s = new String("Mphasis"); //Mphasis
		s.concat("The Next ");
	//	s=s.concat(" Applied"); //
		
		System.out.println(s);
		
		StringBuffer sb = new StringBuffer("Mphasis"); // sb Mphasis
		
		sb.append("The Next Applied"); // Mphasis The Next Applied
		System.out.println(sb);
		
		StringBuilder stb = new StringBuilder("Java");
		stb.append(" With Selinium");
		System.out.println(stb);
		
		
		
		
	}

}
