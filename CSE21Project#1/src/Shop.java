import java.util.Scanner;

public class Shop {
	int function;
	static int number;
	static String [] products;
	static double [] price;
	static double amtDiscount;
	static double discount;
	static int [] count;
	static double [] totPrice;
	static double subtotal = 0;
	static double FinDiscount = 0;
	static double total = 0;
	static boolean setGo = false;
	static boolean AllGood = false;

	
	private static void intro() {
		Scanner input = new Scanner(System.in);
		
		System.out.println("This program supports 4 functions: ");
		System.out.println("1. Setup Shop \n2. Buy \n3. List Items \n4. Checkout");
		System.out.print("Please choose the funtion you want: ");
		int function = input.nextInt();
		
		
		if (function == 1){
			setupShop();
			setGo = true;
		} else if (function == 2){ 
			if (setGo == true){
				Buy();
			} else {
				System.out.println("\nShop is not set up yet!\n");
				intro();
			}
		} else if (function == 3){
			if(setGo == false){
				System.out.print("Shop is not set up yet!\n\n");
				intro();
			}
			else if(setGo == true && AllGood == false){
				System.out.println("Try again: You have not bought anything\n\n");
				intro();
			} else {	
				listItems();
			}
		} else if (function == 4){
			if (setGo == false){
				System.out.print("Shop is not set up yet!\n\n");
				intro();
			} else if(setGo == true && AllGood == false) {
				System.out.println("Try again: You have not bought anything\n\n");
				intro();
			} else {
				checkout();
			}
		} else {
			System.out.print("Error: Do not know " + function +"\n\n");
			intro();
		}
	}
	
//____________________________________________________________________________________
	public static void setupShop(){
		Scanner input = new Scanner(System.in);
		
		System.out.print("Please enter the number of items: ");
		number = input.nextInt();
		
		products = new String[number];
		price = new double[number];
		
		if(number > 0){
			
			for (int i = 0; i < number; i++){
				System.out.print("Enter name of product " + i + ": ");
				products[i] = input.next();
				System.out.print("Enter the prices of product " + i + ": ");
				price[i] = input.nextDouble();
			}
			if (number <= 0){
				System.out.print("Invalid number");}
		}
			
		System.out.print("Please eneter the amount to qualify for discount: ");
		amtDiscount = input.nextInt();
		System.out.print("Please enter the discount rate(.1 for 10%): ");
		discount = input.nextDouble();	
		System.out.println();
		setGo = true;
		
		intro();
	}
//____________________________________________________________________________________	
	public static void Buy(){
		count = new int[number];
		Scanner input = new Scanner(System.in);
		for (int i = 0; i < number; i++){
			System.out.print("Enter the amount of " + products[i] + ": ");
			count[i] = input.nextInt();
			//Calculates subTotal
			totPrice[i] = price[i] * count[i];
		}
		
		AllGood = true;
		
		return;
	}
//____________________________________________________________________________________
	public static void listItems(){
		
		for (int i = 0; i < number; i++){
			
			System.out.println(count[i] + " count of " + products[i] + " @ " + price[i] + " = " + totPrice[i]);
		}

		intro();
		
	}
//____________________________________________________________________________________
	public static void checkout(){
		
		//System.out.println("Thanks for coming!");
		
		for (int i = 0; i < number; i++)
			subtotal += totPrice[i];
		
		if (subtotal >= amtDiscount){
			FinDiscount = discount *subtotal; 
			System.out.println("-Discount: " + FinDiscount);
		
		}else if (subtotal < amtDiscount){
		System.out.println("-Discount: " + FinDiscount);
		}
		total = total - FinDiscount;
		System.out.println("Total: " + total);
		
	}
	
	public static void main(String[] args) {
		intro();
		System.out.println("Thank you! Come again!");
	}
	
}

