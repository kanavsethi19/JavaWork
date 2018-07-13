package searching;

public class LinearSearch {
	
	public static boolean search(int[] numbers, int number) {
		
		if(numbers.length == 0)
			return false;
		
		for(int i = 0; i < numbers.length ; i++) {
			if(numbers[i] == number)
				return true;
		}
		return false;
	}
	
	public static void main(String[] args) {
		int[] numbers = {1,2,3,5,4};
		boolean found  = LinearSearch.search(numbers,5);
		System.out.println("Element found : " + found);
	}

}
