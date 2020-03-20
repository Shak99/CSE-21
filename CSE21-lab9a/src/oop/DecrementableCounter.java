package oop;

public class DecrementableCounter extends Counter {

	public DecrementableCounter() {}
	
	public void decrement() {
		if (super.value() <= 0) {
		super.reset();
	}
		else super.myCount--;
}
}
