package stringgs;

public class Stringlogic {
	
	//1 way

	public static int stringCompare(String s1, String s2) {
		System.out.println(s1.length());
		System.out.println(s2.length());

		for (int i = 0; i < s1.length() && i < s2.length(); i++) {

			System.out.println("s1 unicode character value: "+ (int) s1.charAt(i));
			System.out.println("s2 unicode character value: "+ (int) s2.charAt(i));

			//Difference between unicode value of both characters lexicographically from two Strings
			if ((int) s1.charAt(i) == (int) s2.charAt(i)) {
				continue;
			} 
			else {
				return (int) s1.charAt(i) - (int) s2.charAt(i);
			}
		}
       
		//if characters are same at index positions then we will go for length mechanism
		// Edge case for strings like
		// String 1="geeky" and String 2="geekyguy"
		return (s1.length()-s2.length());
	 
	}

	
	//second way effective way and inbuilt code
	/*public int stringCompare(String anotherString) {
        int len1 = value.length;
        int len2 = anotherString.value.length;
        int lim = Math.min(len1, len2);
        char v1[] = value;
        char v2[] = anotherString.value;

        int k = 0;
        while (k < lim) {
            char c1 = v1[k];
            char c2 = v2[k];
            if (c1 != c2) {
                return c1 - c2;
            }
            k++;
        }
        return len1 - len2;
    }*/

	public static void main(String[] args) {

		/*String s1 = "geeky";
		String s2 = "geekyguy";*/
		
		String s1 = "Geeky";
		String s2 = "natth";
System.out.println("unicode character for G: "+(int)'G');
System.out.println("unicode character for n: "+(int)'n');
		System.out.println(stringCompare(s1, s2));

	}

}



