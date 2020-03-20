package oop;

public class SeasonCounter extends ModNCounter {

	
	private static String[] names =  {"spring", "summer", "fall", "winter"};
	
	
	public SeasonCounter() {
        // fill-in by creating an object with 4 divisor
		super(4); //create a ModNCounter object with max 4
    }
	

	@Override
	public String toString() { //inherited from Object (Q10)
        // fill-in so it returns the season name
		if(value() == 0){
			return names[0];
		}
		else if (value() == 1){
			return names[1];
			//return something
		}
		else if (value() == 2){
			return names[2];
			//return something
		}
		else if(value() == 3){
			return names[3];
			//return something
		}
		else {
			return"";
		}
	}
	
  	
}
