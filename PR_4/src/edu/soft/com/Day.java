package edu.soft.com;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Day {
	public static void main(String[] args) {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		System.out.println("Number of day");
		int dayOfWeek = Integer.parseInt(br.readLine());
				
		Week week;

		switch (dayOfWeek) {
		case 1:
			week = Week.Monday;
			System.out.println("Monday");
			break;

		case 2:
			week = Week.Tuesday;
			System.out.println("Monday");
			break;

		case 3:
			week = Week.Wednesday;
			System.out.println("Monday");
			break;

		case 4:
			week = Week.Thusday;
			System.out.println("Monday");
			break;

		case 5:
			week = Week.Friday;
			System.out.println("Monday");
			break;

		case 6:
			week = Week.Saturday;
			System.out.println("Monday");
			break;
			
		case 7:
			week = Week.Sanday;
			System.out.println("Monday");
			break;

		default:
			System.out.println("No day number");
		}

		System.exit(0);
	}
}
