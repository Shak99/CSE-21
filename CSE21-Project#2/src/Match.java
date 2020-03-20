import java.util.Scanner;
import java.io.FileReader;
import java.io.FileNotFoundException;
import java.util.NoSuchElementException;



public class Match {

	public static void main(String[] args){
		Student [] arr = new Student [100];
	
		
		System.out.println("Please give the file name: ");
		Scanner input = new Scanner(System.in);
		String filename = input.next();
		try{
			Scanner fileInput = new Scanner (new FileReader(filename));
			int i = 0;
			
			while (fileInput.hasNextLine()){
				
				
				Scanner line = new Scanner(fileInput.nextLine());
				line.useDelimiter("[\t\r]");
				String name = line.next(); 
				//System.out.print("Enter gender(M or F): ");
				String gender = line.next(); 
				//System.out.print("Enter today's date: ");
				String date = line.next(); 
				
				Scanner birthDateReader = new Scanner (date);
				birthDateReader.useDelimiter("-");
				//System.out.print("Enter your birthday: ");
				int month = birthDateReader.nextInt();
				int day = birthDateReader.nextInt();
				int year = birthDateReader.nextInt();
				
				
				//System.out.println("Rate your preferenecs on a scale from 0-10. The lowest being 0 and the highest being 10.");
				//System.out.print("Rate quiet time: ");
				int quietTime = line.nextInt(); 
				//System.out.print("Rate music: ");
				int music = line.nextInt();
				//System.out.print("Rate reading: ");
				int reading = line.nextInt();
				//System.out.print("Rate chatting: ");
				int chatting = line.nextInt();
				
				Date birthdate = new Date (month, day, year);
				Preference pref = new Preference(quietTime, music, reading, chatting);
					Student stAdd = new Student(name, gender.charAt(0), birthdate, pref);
					arr[i++] = stAdd;	
		
			}	
				int max = i;
				for (i = 0; i<max; i++){
					if (!arr[i].matched()){
						int bestScore = 0; int bestMatch = 0;
						for (int j=i+1; j<max;j++){
							if(!arr[j].matched()){
								int tmp = arr[i].compare(arr[j]);
							if (tmp > bestScore){
								bestScore = tmp;
								bestMatch = j;
										
										
									}
								}
							}
					if (bestScore != 0){
						arr[i].setMatched(true);
						arr[bestMatch].setMatched(true);
						//System.out.println(arr[i].Name() + " matches with " + arr[bestMatch].Name() + " with the score " + bestScore);
			
					} else
						if (!arr[i].matched())
							System.out.println(arr[i].Name() + " has no matches.");
						}
					}
					input.close();
				} catch (NoSuchElementException e){
					System.out.println(e);
				} catch (FileNotFoundException e){
					System.out.println(e);
				}
			}
	
		
	
	
	
}
