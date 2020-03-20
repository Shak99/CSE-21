package io;

import java.util.*;
import java.io.*;

public class PhoneNums {

	public ArrayList<String> readPhoneNumbers() {
		
		String code = null;
		String areaCode;
		String phoneNum;

		String filename = "data/phone.txt"; 
		ArrayList<String> output = new ArrayList<String>();

		try {
			Scanner input = new Scanner ( new FileReader(filename) );

			while (input.hasNextLine()) {
				
				Scanner line = new Scanner (new FileReader(filename));
				line.useDelimiter("[+ - ]");
				areaCode = line.next();
				phoneNum = line.nextLine();
				
				System.out.println("Country Code: " + code.replace("-",  ""));
				System.out.println("Area Code: " + areaCode.replaceAll("+",  ""));
				System.out.println("Phone Number: " + phoneNum.replaceAll("-",  ""));
				
				if(line.hasNext()){
					System.out.print(line.next());
				}
				
				/*	
				 *	Fill-in 
				 */
				//System.out.println(input.nextLine()); // Comment this line out 
			} 
			input.close();
		} catch ( NoSuchElementException e){
			System.out.println(e);

		} catch (FileNotFoundException e) {
			System.out.println(e);
		}
		
		return output;
		
	}
	
	

}
