package recursion;

public class DigitCount {

	public static void main(String[] args) {
		
		System.out.println(digitCount(0));
		System.out.println(digitCount(10));
		System.out.println(digitCount(314159));
	}
	
	// Fix the bug in digitCount, so that it returns correct values.
	// You should only need to change one line!
	public static int digitCount (int value) {
		if (value <= 0) {
			return 0;
		} else {
			return 1 + digitCount(value/10);
		} 
	}
}

/*
 * e.g. 101
 * 101:	return 1+dc(101/10)
 * 10: 	return 1+dc(10/10)
 * 1:	return 1+dc(1/10)
 * 0:	return 0
 * 
 * e.g. 99
 * 99: return 1+dc(99/10)
 * 9:  return 1+dc(9/10)
 * 0:  return 0; 
 */
