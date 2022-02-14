package com.JsonPracticie;

import org.json.simple.JSONArray;

public class ArrayJSON {
public static void main(String[] args) {
	

	  JSONArray arr = new JSONArray();  
	  arr.add("surendra");    
	  arr.add(new Integer(27));    
	  arr.add(new Double(600000));   
	  System.out.print(arr);  
}
}
