package basics;

import java.util.Arrays;
import java.util.Scanner;

public class MatrixAddition {

	public static void main(String[] args) {
		int p ,q, m, n;
		Scanner s = new Scanner(System.in);
		System.out.println("Enter number of rows in first matrix:");
		p = s.nextInt();
		System.out.println("Enter number of columns in first matrix:");
		q = s.nextInt();
		
		System.out.println("Enter number of rows in second matrix:");
		m = s.nextInt();
		System.out.println("Enter number of columns in second matrix:");
		n = s.nextInt();
		
		if( p==m && q==n ) {
			int[][] arr1= new int[p][q];
			int[][] arr2= new int[m][n];
			int[][] arr3= new int[m][n];
			System.out.println("Enter all elements for first matrix!");
			for(int i = 0;i<p;i++) {
				for(int j=0;j<q;j++) {
					arr1[i][j]=s.nextInt();
				}
			}
			
			System.out.println("Enter all elements for second matrix!");
			for(int i = 0;i<m;i++) {
				for(int j=0;j<n;j++) {
					arr2[i][j]=s.nextInt();
				}
			}
			System.out.println("First Matrix:");
            for (int i = 0; i < p; i++) 
            {
                for (int j = 0; j < q; j++) 
                {
                    System.out.print(arr1[i][j]+" ");
                }
                System.out.println("");
            }
            System.out.println("Second Matrix:");
            for (int i = 0; i < m; i++) 
            {
                for (int j = 0; j < n; j++) 
                {
                    System.out.print(arr2[i][j]+" ");
                }
                System.out.println("");
            }
            
            for(int i = 0; i<arr1.length;i++) {
            	for(int j = 0;j<arr2.length;j++) {
            		arr3[i][j] = arr1[i][j] + arr2[i][j];
            	}
            }
            System.out.println("After addition!");
            for (int i = 0; i < m; i++) 
            {
                for (int j = 0; j < n; j++) 
                {
                    System.out.print(arr3[i][j]+" ");
                }
                System.out.println("");
            }
		}

		
	}

}
