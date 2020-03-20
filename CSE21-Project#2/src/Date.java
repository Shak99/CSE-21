
public class Date {
	
	int year = 0;
	int month = 0;
	int day = 0;
	
	
	public Date(int year, int month, int day){
	
		if (year >= 1900 && year <=3000){
			this.year = year;
		}
		
		if (month >= 1 && month <= 12){
			this.month = month;
		}
		
		if (day >= 1 && day <= 31){
			this.day = day;
		}
		
	}
	public int dayOfYear(){
		int totalDays = 0;
		switch (month) {
			case 12: totalDays +=31;
			case 11: totalDays +=30;
			case 10: totalDays +=31;
			case 9: totalDays +=30;
			case 8: totalDays +=31;
			case 7: totalDays +=31;
			case 6: totalDays +=30;
			case 5: totalDays +=31;
			case 4: totalDays +=30;
			case 3: totalDays +=31;
			case 2: totalDays +=28;
			//case 1: totalDays +=31;
		}
		totalDays += day;
		return totalDays;
	}
	
	public int ageDiff(Date dt){
		int yearDiff = 0;
		int ageDiff = Math.abs((dayOfYear()  + (365 * year)) - (dt.dayOfYear() + (365 * dt.year)));
		yearDiff = ageDiff/30;
		
		if (yearDiff > 60){
			yearDiff = 60;
		}
		
		return yearDiff;
	
	}
}
