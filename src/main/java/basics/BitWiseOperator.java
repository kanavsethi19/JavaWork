package basics;

public class BitWiseOperator {

	public static void main(String[] args) {
		int n = 2;
		if((n & 1) == 0 )
			System.out.println("even!");
		else
			System.out.println("odd!");
	}

}
