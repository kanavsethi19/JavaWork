package basics;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class CollectionsTest {

	public static void main(String[] args) {
		List<String> fruits = new ArrayList<String>();
		fruits.add("apple");
		List<String> unModifiableList  = Collections.unmodifiableList(fruits);
		unModifiableList.add("cherry");
	}

}
