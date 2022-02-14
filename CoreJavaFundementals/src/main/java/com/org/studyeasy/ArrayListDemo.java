package com.org.studyeasy;

import java.util.ArrayList;

public class ArrayListDemo {

	static ArrayList<String> list = new ArrayList<String>();
	public static void main(String[] args) {
		// TODO Auto-generated method stub
 list.add("john");
 list.add("jenny");
 list.add("rahul");
 list.add("kumar");
 list.add("ramu");
 ArrayListDemo al = new ArrayListDemo();
 al.displayList(list);
 al.removeNameByPosition(0);
 al.displayList(list);
 
 System.out.println(list);
	
	}
	 private void removeNameByPosition(int i) {
		// TODO Auto-generated method stub
		list.remove(0);
	}
	void displayList(ArrayList<String> names){
		 for(String name : names) {
			 System.out.println(name);
		 }
		
	}
	

}
