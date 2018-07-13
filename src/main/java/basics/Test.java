package basics;

public class Test {
	public static final int num = 90;
	public final int check = 70;
	public void add(int a ,int b) {
		System.out.println("in int");
		System.out.println(a+b);
	}
	
	public void add(Integer a ,Integer b) {
		System.out.println("in wrapper");
		System.out.println(a+b);
	}
	
	public void add(Long a ,Long b) {
		System.out.println("in Long ");
		System.out.println(a+b);
	}
	
	public static void main(String[] args) {
		Test test = new Test();
		test.add(5,6);
		
		System.out.println("------");
		
		int a = 10; // 10.0 will not work as we are trying to convert float to int, not possible without explicit conversion.

		long l = 10;
		Long d = 10L;  // Will not work without l;
		System.out.println(d);
		
		float b = 10.0f; // Similar to 10f;
		System.out.println(b);
		Float c = 10f; //Will not work without f;

		double m = 10;
		Double n = 10d; // Will not work withou d;
		System.out.println(m);
		
		
		
		/*long g = 10;
		Long b = 10L;
		
		Float a = 10f;
		float f = 10;
		System.out.println(a);
		double c = 10.1;
		Double d = 10.0;
		System.out.println(d);*/
	}

}
