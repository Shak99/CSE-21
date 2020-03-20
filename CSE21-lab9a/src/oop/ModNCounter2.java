package oop;

public class ModNCounter2 extends Counter {

	private int cycleLength;
	public ModNCounter2(int n){
		cycleLength = n;
	}
	public int value() {
		//call value() method
		//and return the value with % cycleLength
		return super.value() % cycleLength;
	}
}
