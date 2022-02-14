package com.learn.selenium;

import java.util.Scanner;

public class ThrowKeywordDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the age ");
        int age = sc.nextInt();
        if(age<18) {
        throw new ArithmeticException("Young guy");
        	//System.out.println();
        }else {
        	System.out.println("Adult guy");
        }
		
	}

}
