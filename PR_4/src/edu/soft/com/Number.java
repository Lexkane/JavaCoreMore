package edu.soft.com;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Number {
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int count = 0;
		System.out.println("First numner");
		int number = Integer.parseInt(br.readLine());
		if(number != number % 2) count++;
		
		System.out.println("Second number");
		int number = Integer.parseInt(br.readLine());
		if(number != number % 2) count++;
		
		System.out.println("Second number");
		int number = Integer.parseInt(br.readLine());
		if(number != number % 2) count++;
		
		System.out.println(count);
	}
}
