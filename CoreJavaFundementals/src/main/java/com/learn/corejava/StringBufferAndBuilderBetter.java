package com.learn.corejava;

public class StringBufferAndBuilderBetter {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		long startTime = System.currentTimeMillis();
		
		StringBuffer sb = new StringBuffer(); // then we performed which one is better
		for(int i=1;i<=10000;i++) {
			sb.append("Mphasis");
		}
		
		long endTime = System.currentTimeMillis();
		
		System.out.println(endTime-startTime);
		
		StringBuilder stb = new StringBuilder();  // StringBuilder is better is performance based
     long startTime2 = System.currentTimeMillis();
     
		for(int i=1;i<=10000;i++) {
			sb.append("Mphasis");
		}
		
		long endTime2 = System.currentTimeMillis();
		
        System.out.println(endTime2-startTime2);
	}

}
