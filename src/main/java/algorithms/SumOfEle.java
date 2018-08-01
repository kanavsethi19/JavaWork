package algorithms;

import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;

public class SumOfEle {
	public static int findelement(List<Integer> list) {
		Integer sum = list.get(0);
		Integer sum2 = list.get(0);
		
		for (Integer number : list) {
			if(number > sum) {
				sum2 = sum;
				sum = number;
			}
		}
		System.out.println(sum);
		System.out.println(sum2);
		return sum + sum2;
	}
	public static void main(String[] args) {
		List<Integer> list = new CopyOnWriteArrayList<Integer>();
		list.add(1);
		list.add(2);
		list.add(4);
		list.add(6);
		list.add(8);
		System.out.println(findelement(list));
	}

}
