package com.belemo.test;

import java.util.Arrays;
import java.util.Random;

public class RandonTest {
	public static void main(String[] args) {
		String[] persons = {"张三","李四","王五"};
		
		
		int r = (int)(Math.random()*3);
		System.out.println(r);
		if (r<persons.length) {
			System.out.println(persons[r]);
		} 
		
		
			
	}
	
}
