package basics;

public class MinimumNumber {

	public static void main(String[] args) {
		int[] numbers = {33,3,4,5,2};
		int min = numbers[0];
		for(int i = 1; i<numbers.length;i++) {
			if(numbers[i]<min)
				min = numbers[i];
		}
		System.out.println(min);
	}

}
