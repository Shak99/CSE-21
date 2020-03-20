import java.util.Scanner;
public class CheeseShop {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int pounds, pounds2, pounds3;
		
		Scanner input = new Scanner(System.in);
		
		System.out.println("We sell 3 kinds of Cheese \nDalaran Sharp: $1.25 per pound \nStormwind Brie: $10.00 per pound \nAlterac Swiss: $40.00 per pound");
		
		System.out.print("Enter the amount of Sharp: ");
		pounds = input.nextInt();
		System.out.print("Enter the amount of Brie: ");
		pounds2 = input.nextInt();
		System.out.print("Enter the amount of Swiss: ");
		pounds3 = input.nextInt();
		
		int yes;
		System.out.print("Display itemized list? (1 for yes) ");
		yes = input.nextInt();
		
		if (yes == 1){
			if (pounds > 0)
				System.out.println(pounds + " lbs of Sharp @ $1.25 = $" + 1.25 * pounds);
			if (pounds2 > 0)
				System.out.println(pounds2 + " lbs of Brie @ $10.00 = $" + 10.0 * pounds2);
			if (pounds3 > 0)
				System.out.println(pounds3 + " lbs of Swiss @ $40.00 = $" + 40.0 * pounds3);
		}
			
		double sub = (pounds * 1.25) + (pounds2 * 10) + (pounds3 * 40);
		
		System.out.println("Sub Total: $" + sub);
		
		double total = 0;
		
		if (sub >= 50 && sub < 100){
			System.out.println("-Discount: $10.0");
			total = sub - 10;
		}
		if (sub >= 100){
			System.out.println("-Discount: $25.0");
			total = sub - 25;
		} if (sub < 50) {
			total = sub;
		}

			System.out.print("Total \t" + " : $" + total);
		

	}

}
