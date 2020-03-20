package oop;

/**
 * A counter class that cycles its internal value back to 0 when it
 * reaches a maximum value. 
 * 
 * e.g., A (new) ModNCounter with a cycleLength (maximum) of 5 will,
 * when increment() is called 7 times, have an internal value of 2
 */
public class ModNCounter  extends Counter { 

	//e.g. max = 5
	//1 2 3 4 5 6 7, but this gonna be
	//1 2 3 4 0 ` 1

    private int cycleLength; 

    public ModNCounter (int n) { 
    	cycleLength = n; 
    }  

    
    public void increment ( ) { 
    	// fill in this method such that value() will return
    	//  the correct value
    	if(super.value() >= cycleLength - 1){
    		super.reset();
    	}
    	else super.increment();
    	//do something below to print...
    	//e.g max = 5
    	//previously, 1 2 3 4 5 6 7,
    	//but this gonna be, 1 2 3 4 0 1 2
    	//do something to make 5 to 0 in case of max 5
    	}
 
}