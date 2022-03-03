//Class name: TestSammich
//Purpose: makes a sammich using set and get methods
//Programmer: Judy Marie Delos Reyes on February 2, 2022

import java.util.Scanner;

public class TestSammich {

	public static void main(String[] args) {
		String ingredient;
		String bread;
		Double price;
		
		Scanner keyboard = new Scanner(System.in);
		
		System.out.println("Makin' a sammich");
		
		System.out.println("Enter ingredient: ");
		ingredient = keyboard.nextLine();
		System.out.println("Enter bread: ");
		bread = keyboard.nextLine();
		System.out.println("Enter price: ");
		price = keyboard.nextDouble();
		
		Sandwich object = new Sandwich(ingredient, bread, price);
//		obj.setIngredient(ingredient);
//		obj.setBread(bread);
//		obj.setPrice(price);
		
		System.out.println("The ingredient used is " + ingredient + ".");
		System.out.println("The bread used is " + bread + ".");
		System.out.println("The price is $" + price + ".");
		
//		System.out.println("The ingredient used is " + obj.getIngredient());
//		System.out.println("The bread used is " + obj.getBread());
//		System.out.println("The price is $" + obj.getPrice());
		
//		System.out.println("Enter another price: ");
//		double newPrice = keyboard.nextDouble();
//		obj.setPrice(newPrice);
	}
}
