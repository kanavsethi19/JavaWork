package searching;

import java.util.Arrays;
import java.util.List;

public class BinarySearch {
	
	public static boolean search(List<Integer> numbers, Integer check) {
		//numbers should be a sorted array!
		if(numbers.isEmpty() || numbers == null)
			return false;
		
		Integer comparison = numbers.size()/2;
		
		if(check.equals(comparison))
			return true;
		
		if(check < comparison)
			return search(numbers.subList(0, numbers.size()/2), check);
		else
			return search(numbers.subList(numbers.size()/2+1, numbers.size()), check);
	}

	public static void main(String[] args) {
		List<Integer> numbers = Arrays.asList(1,2,3,4);
		boolean found = BinarySearch.search(numbers, 8);
		System.out.println(found);
	}

}
