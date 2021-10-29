
	import java.util.*;
	public class menu {
	public double subTotal;
	public static double runningTotal;
	private static double itemPrice;
	static boolean ordering = true;
	static Scanner input = new Scanner(System.in); 
	public static void menu() {
	System.out.println("Welcome \n1. dosa (rs30.00) \n2. idli (rs25.00)\n3. chai (rs10.00) \n4. Done");
	} public static double itemPrice(int foodItem) {
	if (foodItem == 1) {
	System.out.println("You've ordered a dosa");
	itemPrice = 30.00;
	}
	if (foodItem == 2) {
	System.out.println("You've ordered idli");
	itemPrice = 25.00;
	}
	if (foodItem == 3) {
	System.out.println("You've ordered a chai");
	itemPrice = 10.00;
	}
	quantity();
	return itemPrice;
	} public static double quantity() {
	System.out.println("Enter quantity");
	double quantity = input.nextDouble();
	subTotal(quantity, itemPrice);
	return quantity;
	} public static double subTotal(double quantity, double itemPrice) {
	double subTotal = quantity * itemPrice;
	System.out.println("Subtotal: " + subTotal);
	return subTotal;
	} public static void done(double runningTotal) {
	ordering = false;
	System.out.println(runningTotal);
	System.out.println("Enjoy your meal");
	}
	public static void main(String[] args) {
	int menuOption;
	int foodItem = 0;
	input = new Scanner(System.in);
	do {
	double runningTotal = 0;
	menu();
	menuOption = input.nextInt();
	switch (menuOption) {
	case 1:
	foodItem = 1;
	itemPrice(foodItem);
	break;
	case 2:
	foodItem = 2;
	itemPrice(foodItem);
	break;
	case 3:
	foodItem = 3;
	itemPrice(foodItem);
	break;
	case 4:
	done(runningTotal);
	break;
	default:
	System.out.println("Invalid option.");
	}
	} while (ordering);
	{
	subTotal(quantity(), itemPrice(foodItem));
	runningTotal = runningTotal + subTotal(quantity(), itemPrice(foodItem));
	}
	}
	}




