
import java.util.Arrays;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

Scanner scan= new Scanner(System.in);
		
		/*											//1
		int count=0;
		for (int i=0; i<3; i++)
		if (scan.nextInt()%2!=0) 
			count++;
		
		System.out.println(count);
		*/
		
		
													//2
		/*
		byte number=scan.nextByte();
		
		switch (number) {
		case 1 : System.out.println(", Monday, Montag"); break;
		case 2 : System.out.println(", Tuesday, Dienstag"); break;
		case 3 : System.out.println(", Wednesday, Mittwoch"); break;
		case 4 : System.out.println(", Thursday, Donnerstag"); break;
		case 5 : System.out.println(", Friday, Freitag"); break;
		case 6 : System.out.println(", Saturday, Samstag"); break;
		case 7 : System.out.println(", Sunday, Sonntag"); break;
		default: System.out.println("This day does not exist");break;
		}
		*/
		
		
														//3
		/*
		Continent continent = null;
	
		switch(scan.nextLine()) {
		case "Ukraine" :
		case "Italy":
		continent=Continent.EUROPE;	break;
		
		case "Japan" :
		case "China":
		continent=Continent.ASIA;	break;
		
		case "Egypt" :
		case "Nigeria":
		continent=Continent.AFRICA;	break;
		
		case "Australia" :
		case "Samoa":
		continent=Continent.AUSTRALIA;	break;
	
		case "Canada" :
		case "Panama":
		continent=Continent.NORTH_AMERICA;	break;
		
		case "Argentina" :
		case "Colombia":
		continent=Continent.SOUTH_AMERICA;	break;		
		
		case "Antarctica" :
		continent=Continent.ANTARCTICA;	break;	
		
		default: System.out.println("This continent does not exist");break;
		}
		
		if (continent!=null)
		System.out.println(continent);
		*/
		
															//4
		
		Product pizza=new Product("Pizza", 20.8, 30);
		Product bread=new Product("Bread", 100, 100);
		Product milk=new Product("Milk", 20.81, 12);
		Product sweets=new Product("Sweets", 60, 1);

		Product [] product_Array= new Product [] {pizza, bread, milk, sweets};		
	
		Product.to_sort_for_Price_0(product_Array);
		Product.sOut_product_Array_Price(product_Array);
		
		System.out.println("**************");
		
		Product.to_sort_for_Quantity_0(product_Array);
		Product.sOut_product_Array_Quantity(product_Array);
		
		System.out.println("**************");
		
		Product.to_sort_for_Price_0(product_Array);
		Product.sOut_product_Array_Price(product_Array);
		System.out.println();
		
		
		
		
	}

}
