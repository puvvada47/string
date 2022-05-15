package stringgs;

public class Equalsstring {
	public static void main(String[] args) {
		String s1="viswanath";
		String s2="viswanath";
		
		
		String s3="viswanath";
		String s4= new String("viswanath");
		
		
		System.out.println("Equals: "+s1.equals(s2));  
		System.out.println("==:  "+(s1==s2));  
		
		System.out.println("Equal: "+s3.equals(s4));
		System.out.println("==: "+(s3==s4));
		
		
		
	}

}


//Equals checks only values when it is dealing with Object
//== checks both address and value when it is dealing with Object


//Equals checks only values when it is dealing with variables
//== checks values when it is dealing with variables.

//call by varaiable when dealing with varaibles
//call by refernce when dealing with object.
