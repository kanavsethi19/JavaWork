package sorting;

import java.util.Arrays;

public class BubbleSort {
	public static void sort(Integer[] unSortedList){
		boolean numbersSwitched;
		do {
			numbersSwitched = false;
			for(int i = 0; i < unSortedList.length - 1; i++) {
				if(unSortedList[i] > unSortedList[i+1]) {
					int k = unSortedList[i+1];
					unSortedList[i+1] = unSortedList[i];
					unSortedList[i] = k;
					numbersSwitched = true;
				}
			}
			
		}while(numbersSwitched);
		
		System.out.println(Arrays.toString(unSortedList));
	}
	public static void main(String[] args) {
		Integer[] arr = {4,3,2};
		BubbleSort.sort(arr);
	}

}
