package algorithms;

public class StringContains {

	public static void main(String[] args) {
		String name = "kanavsethi";
		String pattern = "vse";
		int count = 0;
		char c, p;
		for (int i = 0; i < name.length() - pattern.length(); i++) {
			c = name.charAt(i);
			p = pattern.charAt(0);
			if(c == p) {
				for(int j=i,k=0; j < i+pattern.length() ;j++,k++) {
					if((name.charAt(j) == pattern.charAt(k))) {
						count++;
					}
				}
			}
		}
		if(count == pattern.length())
			System.out.println(true);
		else 
			System.out.println(false);
	}

}
