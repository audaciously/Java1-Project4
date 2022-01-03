
/**
 * This is a template for your project 4.
 * You may use this file to fill in all the methods.
 * Please feel free to import necessary modules.
 * @author sudhigopal
 */

/**
 * This is a program for calculating the total charge for orders at a Tex Mex restaurant.
 * @author abigailclarke
 * @version 1.0
 */

import java.util.Scanner;

public class Project_4 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// All the menu items with constant price values
		final double NONE = 0.0;
		final double ENCHILADA = 12.75;
		final double BURRITO = 10.50;
		final double QUESADILLA = 8.25;
		final double BEANS = 2.00;
		final double RICE = 1.75;
		final double TORTILLAS = 1.00;
		final double SOPAPILLAS = 5.00;
		final double CHURRO = 5.75;
		final double TRES_LECHES = 6.50;
		final double COFFEE = 4.50;
		final double ICE_TEA = 2.75;
		final double SODA = 2.25;
		final double TAX = 0.0875;
		final double TIP = 0.175;

		double entreePrice = 0.0;
		double sidePrice = 0.0;
		double dessertPrice = 0.0;
		double drinksPrice = 0.0;

		String entree = null;
		String side = null;
		String dessert = null;
		String drink = null;

		Scanner keyboard = new Scanner(System.in);

		// Welcome message
		System.out.println("Hola! Welcome to Abi's Cantina.");

		// Entree order
		System.out.println("What entree item would you like?");
		System.out.println("Please enter:");
		System.out.println(
				"0 for no entree" + "\n" + "1 for enchilada" + "\n" + "2 for burrito" + "\n" + "3 for quesadilla");

		int input = keyboard.nextInt();

		// Invalid input -- Asks again for order
		while (input < 0 || input > 3) {
			System.out.println("What entree item would you like?");
			System.out.println("Please enter:");
			System.out.println(
					"0 for no entree" + "\n" + "1 for enchilada" + "\n" + "2 for burrito" + "\n" + "3 for quesadilla");

			input = keyboard.nextInt();
		}

		// Valid input
		if (input >= 0 && input <= 3) {
			if (input == 0) {
				entreePrice = NONE;
			} else if (input == 1) {
				entreePrice = ENCHILADA;
				entree = ("Enchilada: $");
			} else if (input == 2) {
				entreePrice = BURRITO;
				entree = ("Burrito: $");
			} else if (input == 3) {
				entreePrice = QUESADILLA;
				entree = ("Quesadilla: $");
			}
		}

		// Side dish order
		System.out.println("What side dish would you like?");
		System.out.println("Please enter:");
		System.out
				.println("0 for no side dish" + "\n" + "1 for beans" + "\n" + "2 for rice" + "\n" + "3 for tortillas");

		input = keyboard.nextInt();

		// Invalid input -- Asks again for order
		while (input < 0 || input > 3) {
			System.out.println("What side dish would you like?");
			System.out.println("Please enter:");
			System.out.println(
					"0 for no side dish" + "\n" + "1 for beans" + "\n" + "2 for rice" + "\n" + "3 for tortillas");

			input = keyboard.nextInt();
		}

		// Valid input
		if (input >= 0 && input <= 3) {
			if (input == 0) {
				sidePrice = NONE;
			} else if (input == 1) {
				sidePrice = BEANS;
				side = ("Beans: $");
			} else if (input == 2) {
				sidePrice = RICE;
				side = ("Rice: $");
			} else if (input == 3) {
				sidePrice = TORTILLAS;
				side = ("Tortillas: $");
			}
		}

		// Dessert order
		System.out.println("What dessert item would you like?");
		System.out.println("Please enter:");
		System.out.println("0 for no dessert" + "\n" + "1 for sopapillas" + "\n" + "2 for churro" + "\n"
				+ "3 for tres leches cake");

		input = keyboard.nextInt();

		// Invalid input -- Asks again for order
		while (input < 0 || input > 3) {
			System.out.println("What dessert item would you like?");
			System.out.println("Please enter:");
			System.out.println("0 for no dessert" + "\n" + "1 for sopapillas" + "\n" + "2 for churro" + "\n"
					+ "3 for tres leches cake");

			input = keyboard.nextInt();
		}

		// Valid input
		if (input >= 0 && input <= 3) {
			if (input == 0) {
				dessertPrice = NONE;
			} else if (input == 1) {
				dessertPrice = SOPAPILLAS;
				dessert = ("Sopapillas: $");
			} else if (input == 2) {
				dessertPrice = CHURRO;
				dessert = ("Churro: $");
			} else if (input == 3) {
				dessertPrice = TRES_LECHES;
				dessert = ("Tres leches cake: $");
			}
		}

		// Drink order
		System.out.println("What drink item would you like?");
		System.out.println("Please enter:");
		System.out.println("0 for no drinks" + "\n" + "1 for coffee" + "\n" + "2 for ice tea" + "\n" + "3 for soda");

		input = keyboard.nextInt();

		// Invalid input -- Asks again for order
		while (input < 0 || input > 3) {
			System.out.println("What drink item would you like?");
			System.out.println("Please enter:");
			System.out.println("0 for no drinks" + "\n" + "1 for coffee" + "\n" + "2 for ice tea" + "\n" + "3 for soda");

			input = keyboard.nextInt();
		}

		// Valid input
		if (input >= 0 && input <= 3) {
			if (input == 0) {
				drinksPrice = NONE;
			} else if (input == 1) {
				drinksPrice = COFFEE;
				drink = ("Coffee: $");
			} else if (input == 2) {
				drinksPrice = ICE_TEA;
				drink = ("Ice tea: $");
			} else if (input == 3) {
				drinksPrice = SODA;
				drink = ("Soda: $");
			}
		}

		// Totaling up the price of items
		double subTotal = calculateTotal(entreePrice, sidePrice, dessertPrice, drinksPrice);

		// Calculating tax on top of the subtotal
		double totalTax = calculateTax(subTotal, TAX);

		// Calculating tip on top of the subtotal
		double totalTip = calculateTip(subTotal, TIP);

		// Calculating grand total
		double grandTotal = calculateGrandTotal(subTotal, totalTax, totalTip);

		// Printing the receipt
		display(entreePrice, sidePrice, dessertPrice, drinksPrice, subTotal, totalTax, totalTip, grandTotal, entree,
				side, dessert, drink);

	}

	public static double calculateTotal(double entreePrice, double sidePrice, double dessertPrice, double drinksPrice) {

		double subTotal = 0.0;

		subTotal = entreePrice + sidePrice + dessertPrice + drinksPrice;

		return subTotal;
	}

	public static double calculateTip(double subTotal, double tipPercent) {

		double totalTip = 0.0;

		totalTip = subTotal * tipPercent;
		
		totalTip = totalTip*100;
		totalTip = Math.round(totalTip);
		totalTip = totalTip /100;

		return totalTip;
	}

	public static double calculateTax(double subTotal, double taxPercent) {

		double totalTax = 0.0;

		totalTax = subTotal * taxPercent;
		
		totalTax = totalTax*100;
		totalTax = Math.round(totalTax);
		totalTax = totalTax /100;

		return totalTax;
	}

	public static double calculateGrandTotal(double subTotal, double totalTax, double totalTip) {

		double grandTotal = 0.0;

		grandTotal = subTotal + totalTax + totalTip;
		
		grandTotal = grandTotal*100;
		grandTotal = Math.round(grandTotal);
		grandTotal = grandTotal /100;

		return grandTotal;
	}

	public static void display(double entreePrice, double sidePrice, double dessertPrice, double drinksPrice,
			double subTotal, double totalTax, double totalTip, double grandTotal, String entree, String side,
			String dessert, String drink) {

		// Please use this for all the lines in the output.
		// Do not add or delete any dashes.


		
		
		System.out.println("-----------------------------------------------------");
		System.out.println("Abi's Cantina" + "\n" + "Your order was:");
		System.out.print("\t" + entree);
		System.out.printf("%.2f", entreePrice);
		System.out.println();
		System.out.print("\t" + side);
		System.out.printf("%.2f", sidePrice);
		System.out.println();
		System.out.print("\t" + dessert);
		System.out.printf("%.2f", dessertPrice);
		System.out.println();
		System.out.print("\t" + drink);
		System.out.printf("%.2f", drinksPrice);
		System.out.println();
		System.out.println("-----------------------------------------------------");
		System.out.print("\t" + "Subtotal: $");
		System.out.printf("%.2f", subTotal);
		System.out.println();
		System.out.print("\t" + "Tax: $");
		System.out.printf("%.2f", totalTax);
		System.out.println();
		System.out.print("\t" + "Tip: $");
		System.out.printf("%.2f", totalTip);
		System.out.println();
		System.out.println("-----------------------------------------------------");
		System.out.print("\t" + "Grand Total: $");
		System.out.printf("%.2f", grandTotal);
		System.out.println();
		System.out.println("Thank you for visiting Abi's Cantina!");
		System.out.println("-----------------------------------------------------");

	}

}
