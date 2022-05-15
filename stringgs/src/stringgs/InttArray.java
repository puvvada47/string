package stringgs;

import java.util.Arrays;

public class InttArray {
	 public static void main(String[] args) {
		//1 way
		 int[] a={1,2,3,20,10,40,100,21,22,23};
		 int []k={2,3,4};
		 int []l={3,4,5,6};
		 
		 
		 //Sorting the array
		 System.out.println(a.toString());
		 Arrays.sort(a);
		 for(int p:a)
			 System.out.println(p);
		 
		 
		 System.out.println(a);
		 System.out.println(a[2]);
		 
		 
		 //2 way
		 int[] b=new int[3];
		 b[0]=1;
		 b[1]=2;
		 System.out.println(b[1]);
		 
		 //3 way
		 int[] c;
		 c=new int[5];
		 c[0]=3;
		 c[1]=4;
		 System.out.println(c[1]);
		 
		 
		 // 4 way
		 int[] dec=new int[]{1,2,3};
		 System.out.println(dec[0]);
		 
		 
		 
	}

}
