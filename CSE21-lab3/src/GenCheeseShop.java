import java.util.Random;
import java.util.Scanner;
public class GenCheeseShop {

	public static void main(String[] args) {
		
final int MAXCHEESE = 6;
Scanner input = new Scanner(System.in);
		
		String[] names = new String[MAXCHEESE];
		double[] prices = new double[MAXCHEESE];
		int[] amounts = new int[MAXCHEESE];
		int yes = 0;
		double[] sum = new double[MAXCHEESE];
		double subtotal = 0;
		double discount = 0;
		double total = 0;
		
		// Special 3 Cheeses
		if (MAXCHEESE > 0) {
		names[0] = "Dalaran Sharp";
		prices[0] = 1.25;
		}
		
		if (MAXCHEESE > 1){
		names[1] = "Stormwind Brie";
		prices[1] = 10.00;
		}
		
		if(MAXCHEESE > 2){
		names[2] = "Alterac Swiss";
		prices[2] = 40.00;
		}
		
 		System.out.println("We sell " + MAXCHEESE + " kinds of Cheese");
 		
 		if (MAXCHEESE > 0){
		System.out.println(names[0] + ": $" + prices[0] + " per pound");
 		}
 		if (MAXCHEESE > 1){
		System.out.println(names[1] + ": $" + prices[1] + " per pound");
 		}
 		if (MAXCHEESE > 2){
 		System.out.println(names[2] + ": $" + prices[2] + " per pound");
 		}

 		Random ranGen = new Random(100);

		for (int i = 3; i < MAXCHEESE; i++) {
			names[i] = "Cheese Type " + (char)('A'+i);
			prices[i] = ranGen.nextInt(1000)/100.0;
			amounts[i] = 0;

			System.out.println(names[i] + ": $" + prices[i] + " per pound");
		}
	//__________________________________________________________________	
		for (int i = 0; i < MAXCHEESE; i++){
		System.out.print("Enter the amount of " + names[i] + " : ");
		amounts[i] = input.nextInt();
		}
		
		System.out.print("Display itmeized list? (1 for yes) ");
		yes = input.nextInt();
		
		if (yes == 1){
			for (int i = 0; i < MAXCHEESE; i++){
				sum[i] = (prices[i]) * (amounts[i]);
				System.out.println(amounts[i] + "lbs the amount of " + names[i] + " : $" + sum[i]);
				subtotal += sum[i];
			}
		
			System.out.println("\nSub Total: $" + subtotal);
			if (subtotal > 50 && subtotal < 100){
				discount = 10;
				System.out.println("-Discount: $" + discount);
			} if (subtotal >= 100){
				discount = 25;
			System.out.println("-Discount: $" + discount);
			}
			total = subtotal - discount;
			System.out.print("Total    : $" + total);
		}
	//_______________________________________________________________	
		else {
			for (int i = 0; i < MAXCHEESE; i++){
				sum[i] = (prices[i]) * (amounts[i]);
				subtotal += sum[i];
			}
			System.out.println("\nSub Total: $" + subtotal);
			if (subtotal > 50 && subtotal < 100){
				discount = 10;
				System.out.println("-Discount: $" + discount);
			} if (subtotal >= 100){
				discount = 25;
			System.out.println("-Discount: $" + discount);
			}
			total = subtotal - discount;
			System.out.print("Total    : $" + total);
		}
		

	}

}

