package algorithms;

import java.util.LinkedHashMap;
import java.util.Map;

public class StringNonRepeat {

	public static void main(String[] args) {
		String name = "ffeeddbbaaclck";
		String[] arr = name.split("");
		Map<String,Integer> map = new LinkedHashMap<String, Integer>();
		for(String str : arr) {
			if( !(map.containsKey(str))) {
				map.put(str, 1);
			}
			else if(map.containsKey(str)) {
				Integer i =map.get(str);
				map.put(str, ++i);
			}
		}
		System.out.println(map);
		for(Map.Entry<String, Integer> entry: map.entrySet()) {
			if(entry.getValue() == 1) {
				System.out.println(entry.getKey());
				break;
			}
		}
	
	}

}
