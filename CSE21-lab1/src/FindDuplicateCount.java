
public class FindDuplicateCount {

	public static void main(String[] args) {
		int[] arr = {1, 2, 2, 3, 4, 2, 4, 3, 0, 5, 3, 2};
		
		int count = 0;
		int k = 0;
		int j = 0;
		for (int i = 0; i < arr.length; i++){
			k = arr[i];
			for (j = i + 1; j < arr.length; j++){
				if (k == arr[j]){
					count++;
				}
			
			}
			
			if (count == 1)
				System.out.println("There is only one occurences of value " + k + " starting at index " + (i) );
			if (count > 1)
			System.out.println("There are " + count + " occurences of value " + k + " starting at index " + (i) );
			if (count == 0)
			System.out.println("No duplicates with value " + k + " beyond index " + (i));
			count = 0;
		}
		
		
				
			
					
						
			
		}
		
	

}
