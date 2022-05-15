package stringgs;

import java.util.Arrays;

public class Stringssexplore {
	public static void main(String[] args) {
		String s1="java";//creating string by java string literal  
		String s5="boo,and,foo";
		String s6=" kali ";
		
		char ch[]={'s','t','r','i','n','g','s'};
		char[] cha={'a','b','c'};
		char[]c={'a','d'};
		
		String[] arr={"kali","nath","puada"};
		
		
		String[] arr1=new String[3];//declaration,instanization
		arr1[0]="kali";//initialization
		arr1[1]="nath";
		
		String[] arr4=new String[]{"kali","nath","puada"}; //declaration,instanization and initialization
		
		
		System.out.println(arr[0]);
		System.out.println(arr1[0]);
		System.out.println( arr4[2]);
		
		System.out.println(ch);
		System.out.println(cha);
		System.out.println(c);
		
		String s2=new String(ch);//converting char array to string  
		
		String s3=new String("java");//creating java string by new keyword  
		System.out.println("string literal:"+s1);  
		System.out.println("converting char array to string:"+s2);  
		System.out.println("String new instance:"+s3);  
		
	
	System.out.println(s1.compareTo(s3));
	System.out.println("character at index: "+s1.charAt(1));
	System.out.println("Concatanation of two strings: "+s1.concat(s3));
	System.out.println("String contains character or not: "+s1.contains("j"));
	System.out.println("String whether starting with characters or not: "+s1.startsWith("ja"));
	System.out.println("String whether ending with characters or not: "+s1.endsWith("j"));
	System.out.println("index of characters in string: "+s1.indexOf("a"));
	System.out.println("index of last characters in string: "+s1.lastIndexOf("a"));

	
	 String[] k=s5.split(",");
	 System.out.println(k[1]);
for(String co:k){
	System.out.println( co);}
System.out.println("char array: "+ s1.toCharArray());
System.out.println("lower case: "+s1.toLowerCase());
System.out.println("upper case: "+s1.toUpperCase());
System.out.println("length of the string: "+ s1.length());
System.out.println("substring: "+s1.substring(1));
System.out.println("substring: "+s1.substring(1, 3));
System.out.println(s6);
System.out.println("trim: "+s6.trim());
System.out.println("replace: "+s1.replace("a", "k"));
System.out.println("replaceall: "+s1.replaceAll("a","k"));
System.out.println("hascode value: "+s1.hashCode());
System.out.println("To string method:"+ s1.toString());

System.out.println("equals method: "+s1.equals(s3));
String s11=new String("hello");  
String s22="hello";  
String s33=s11.intern();//returns string from pool, now it will be same as s22 
System.out.println("equals symbol: "+(s11==s22));//false because reference is different (it checks not only reference but also value)
System.out.println("equals method:"+s11.equals(s22));//true since it checks only value but not reference
System.out.println(s22==s33);//true because reference is same  
String joinString1=String.join("|","welcome","to","javatpoint");  
System.out.println("join string by delimter: "+joinString1); 
	}

}
