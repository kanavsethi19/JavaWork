package basics;

public class MatrixDiagonal {

	public static void main(String[] args) {
		int[][] array = { { 1, 2, 3 }, { 4, 5, 6 }, { 7, 8, 9 } };
		for (int i = 0; i < array.length; i++) {
			for (int j = 0; j < array.length; j++) {
				System.out.print(array[i][j] + " ");
			}
			System.out.println();
		}
		System.out.println();
		
		for(int r = 0 ; r<array.length; r++) {
			for(int row = r,col = 0; row>=0 && col<array.length; row--, col++) {
				System.out.print(array[row][col]);
			}
			System.out.println();
		}
		for(int c = 1 ; c<array.length;c++) {
			for(int row = array.length-1,col=c; row >=0&& col<array.length; row--,col++) {
				System.out.print(array[row][col]);
			}
			System.out.println();
		}
		
	}

}
