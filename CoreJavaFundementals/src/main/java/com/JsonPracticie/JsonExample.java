package com.JsonPracticie;

import org.json.simple.JSONObject;

public class JsonExample {

	public static void main(String args[]){    
		JSONObject obj=new JSONObject();    
		  obj.put("name","Surendra");    
		  obj.put("age",new Integer(22));    
		  obj.put("salary",new Double(600000));    
		   System.out.print(obj);   
}
}
