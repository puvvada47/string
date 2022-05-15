package stringgs;

public class Strincharcount {
	public static void main(String[] args) {
		String s="javaisproragmminglanguage";
		char[] a=s.toCharArray();
		char []b = new char[s.length()];
		for(int i=0;i<s.length();i++){
			char source=a[i];
			if(String.valueOf(b).contains(String.valueOf(source))){
				continue;
			}
			b[i]=source;
			//System.out.println(String.valueOf(b));
			int count=0;
			//taking one character and looping through remaining characters in the chararray.
			for(int j=i;j<s.length();j++){
				char target=a[j];
				if(source==target ){
					count++;
					}
				
			}
			System.out.println("character count:"+source+" "+count);
			
		}
		
	}

}
