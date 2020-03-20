package pig;

public class Player3 extends Player{

		// TODO Auto-generated method stub
	
		public boolean throwAgain(Player opponent){
		if(r.nextInt(6) < 5) {
			return true;
		} else {
			return false;
		}
	}

}
