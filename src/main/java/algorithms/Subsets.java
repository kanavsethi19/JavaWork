package algorithms;

import java.util.HashSet;
import java.util.Set;

public class Subsets {
	public static void findSubsets(Set<String> items) {
		int length = items.size();
		for(int i=0; i < (1 << length);i++) {
			System.out.print("{");
			for(int j=0; j < length;j++) {
				if((i & (1 << j)) > 0)
					System.out.print(items.toArray()[j]);
			}
			System.out.println("}");
		}

	}

	public static void main(String[] args) {
		Set<String> alpha = new HashSet<String>();
		alpha.add("a");
		alpha.add("b");
		alpha.add("c");
		Subsets.findSubsets(alpha);
	}

}
