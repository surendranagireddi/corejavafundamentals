package com.learn.corejava;

public class StringMethodsDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	  String s = "Mphasis The Next Applied";
	  
	  int lengthOfString = s.length();
	  
	  System.out.println("Length of String "+lengthOfString);
	  
	  String lowerCases = s.toLowerCase();
	  System.out.println("Lowercase of String "+lowerCases);
	  
	  String upperCases =s.toUpperCase();
	  System.out.println("UpperCase of String "+upperCases);
	  
	  System.out.println(s.charAt(4));
	  
	  char ch = s.charAt(4);
	  System.out.println(ch);
	  
	  String str = s.concat(" Learning");
	  System.out.println(str);
	  
	 boolean bool= s.contains("The");
	 boolean bool1= s.contains("zzz");
	 
	 System.out.println(bool);
	 System.out.println(bool1);
	 
	 boolean bool2 = s.endsWith("Next Applied");
	 System.out.println(bool2);
	 
	 boolean bool3 = s.startsWith("Mphasis");
	 System.out.println(bool3);
	 
	 String ss = "";
	boolean bool4 = ss.isEmpty();
	System.out.println(bool4);
	
	int indexOfChar = s.indexOf('a');
	System.out.println(indexOfChar);
	
	int occurenceOfString =s.indexOf("The");
	System.out.println(occurenceOfString);
	
	int lastIndexOfChar =s.lastIndexOf("e");
	System.out.println(lastIndexOfChar);
	
	String[] stt = s.split(" ");
	for(String string:stt) {
		System.out.println(string);
		System.out.println("-------");
	}
	
	
	 
	 
	 
	  
		
	}

}
