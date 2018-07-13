package basics;

public class ThisTest {
	public String name;
	public ThisTest(String name) {
		this.name = name;
		System.out.println(this.name);
	}
	public static void main(String[] args) {
		new ThisTest("kk");
	}

}
