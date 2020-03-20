import java.util.Scanner;
public class remainderFunc {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner input = new Scanner(System.in);
		
		System.out.print("Please enter max number: ");
		int max = input.nextInt();
		System.out.print("Please enter the divisor: ");
		int div = input.nextInt();
		
		int i;
		int res = 0;
		for (i = 1; i <= max; i++){
		res = i % div;
		System.out.println("Num: " + i + " % " + div + " = " + res);
		}
	
	}

}
