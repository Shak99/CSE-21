import java.util.*;

public class RunShop {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.print("Enter the number of Cheese: ");
		int cheese = input.nextInt();
		ShopArr shop = new ShopArr(cheese);
		shop.run();
		System.out.println("Ran with Cheese Total: " + Cheese.numCheese);
	}

}
