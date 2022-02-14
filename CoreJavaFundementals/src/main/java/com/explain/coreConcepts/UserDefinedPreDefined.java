package com.explain.coreConcepts;

public class UserDefinedPreDefined {
	public static void main(String[] args) {
		String companyName ="Mphasis";
		int len = companyName.length();
		System.out.println( companyName.charAt(3));
		System.out.println(len);
		new UserDefinedPreDefined().test();
	}
	public void test() {
		System.out.println("Mphasis");
	}

}
