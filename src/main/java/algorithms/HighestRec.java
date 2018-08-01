package algorithms;

public class HighestRec {
	public static int findMax(int[] arr,int index) {
		if(index>0)
			return Math.max(arr[index],findMax(arr,index-1));
		else 
			return arr[0];
	}
	public static void main(String[] args) {
		int[] arr = {1,2,4,8};
		System.out.println(HighestRec.findMax(arr,3));
	}

}
