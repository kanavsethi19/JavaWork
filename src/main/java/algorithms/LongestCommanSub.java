package algorithms;

import java.util.Arrays;

public class LongestCommanSub {
	public static void findLCS(String str1,String str2) {
		int[][] arr = new int[str1.length()+1][str2.length()+1];
		
		for(int i = 0; i<=str2.length() ; i++) {
			for(int j = 0; j<=str1.length(); j++) {
				if(i==0 || j==0) {
					arr[i][j] = 0;
				}
				else if(str1.charAt(j-1) == str2.charAt(i-1)) {
					arr[i][j] = arr[i-1][j-1]+1;
				}
				else {
					arr[i][j] = Math.max(arr[i-1][j], arr[i][j-1]);
				}
			}
		}
		System.out.print(Arrays.deepToString(arr));
	}
	public static void main(String[] args) {
		String name1 = "TERRACED";
		String name2 = "CRATERED";
		LongestCommanSub.findLCS(name1,name2);
	}

}
