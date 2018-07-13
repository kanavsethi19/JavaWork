package searching;

public class BinarySearch {
	
	public static boolean search(int[] numbers, int check) {
		//numbers should be a sorted array!
		if(numbers.length == 0)
			return false;
		for(int i = 0 ; i<numbers.length; i++) {
		}
		return false;
	}

	public static void main(String[] args) {
		int[] numbers = {1,2,3,4,5};
		boolean found = BinarySearch.search(numbers, 8);
		System.out.println(found);
	}

}
