package stringgs;

import java.util.HashMap;

public class StrincharcountMap {
	public static void main(String[] args) {
		String s = "aa";
		char[] a = s.toCharArray();
		Integer charcount = 0;
		HashMap<Character, Integer> charCountMap = new HashMap<Character, Integer>();

		for (Character singleChar : a) {
			if (charCountMap.containsKey(singleChar)) {
				charcount = charCountMap.get(singleChar);
				System.out.println(charcount);
				charcount++;
				System.out.println(charcount);
				charCountMap.put(singleChar, charcount);

			}
			else{
				charcount = 1;
			charCountMap.put(singleChar, charcount);
			}
		}

		System.out.println(charCountMap);
	}
}
