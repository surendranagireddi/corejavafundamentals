package com.suren.mphasis;

public class School {
	int addmissionFee =500;
	String schoolName ="TLN";
	public static void main(String[] args) {
		School sc = new School();
		int addFee = sc.addmissionFee;
		String scl = sc.schoolName;
		System.out.println(scl);
		System.out.println(addFee);
		College cl = new College();
		/*
		 * String collegeName = cl.collegeName; System.out.println(collegeName);
		 */
	  System.out.println(cl.collegeName);
	}

}
