import java.util.Random;
import java.util.Scanner;

public class GenCheeseShopv2 {

	public static void intro(String[] names, double[]prices, int[] amounts) {
		// Fill-in
		if (names.length > 0) {
			names[0] = "Dalaran Sharp";
			prices[0] = 1.25;
			}
			
			if (names.length > 1){
			names[1] = "Stormwind Brie";
			prices[1] = 10.00;
			}
			
			if(names.length > 2){
			names[2] = "Alterac Swiss";
			prices[2] = 40.00;
			}
			
	 		System.out.println("We sell " + names.length + " kinds of Cheese");
	 		
	 		if (names.length > 0){
			System.out.println(names[0] + ": $" + prices[0] + " per pound");
	 		}
	 		if (names.length > 1){
			System.out.println(names[1] + ": $" + prices[1] + " per pound");
	 		}
	 		if (names.length > 2){
	 		System.out.println(names[2] + ": $" + prices[2] + " per pound");
	 		}

	 		Random ranGen = new Random(100);

			for (int i = 3; i < names.length; i++) {
				names[i] = "Cheese Type " + (char)('A'+i);
				prices[i] = ranGen.nextInt(1000)/100.0;
				amounts[i] = 0;

				System.out.println(names[i] + ": $" + prices[i] + " per pound");
			}
		
	}

	public static void getAmount(Scanner input, String[] names, int[] amounts) {
		// Fill-in

		for (int i = 0; i < names.length; i++){
		System.out.print("Enter the amount of " + names[i] + ":");
		amounts[i] = input.nextInt();
		}
	}

	public static void itemizedList(String[] names, double[]prices, int[] amounts) {
		// Fill-in
		double[] amtC = new double[names.length];
		for (int i = 0; i < names.length; i++){
			if(amounts[i] > 0)
				amtC[i]= amounts[i] * prices[i];
			System.out.println(amounts[i] + " lbs of " + names[i] + " @ " + prices[i] + " = $" + amtC[i]);
		}
	}

	public static double calcSubTotal(double[] prices, int[] amounts) {
		// Fix
		double subTotal = 0;
		double sum= 0;
		for (int i = 0; i < prices.length; i++){
			sum = prices[i] * amounts[i];
			subTotal += sum;
		}
		
		return subTotal;
	}

	public static int discount(double subTotal){
		// Fix
		if (subTotal >= 100){
			return 25;
		}
		if (subTotal > 50 && subTotal < 100){
			return 10;
		}
		else return 0;
		
		
	}

	public static void printTotal(double subTotal, int discount) {
		// Fill-in
		System.out.println("Sub Total: $" + subTotal +"\n" + "-Discount: $" + (discount * 1.0));
		System.out.print("Total : $" + (subTotal - discount));

	}

	public static void main(String[] args) {

		final int MAXCHEESE = 4;

		// DO NOT CHANGE ANYTHING BELOW
		String[] names = new String[MAXCHEESE];
		double[] prices = new double[MAXCHEESE];
		int[] amounts = new int[MAXCHEESE];

		Scanner input = new Scanner(System.in);

		intro(names, prices, amounts);

		getAmount(input, names, amounts);

		double total = calcSubTotal(prices, amounts);
		
		if (MAXCHEESE > 0) {
			System.out.print("Display the itemized list? (1 for yes) ");
			int itemized = input.nextInt();

			if (itemized == 1) {
				itemizedList(names, prices, amounts);
			}
		}

		System.out.println();

		printTotal(total,discount(total));
	}
}
