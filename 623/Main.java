//UVA623;

import java.util.*;
public class Main {

	public static void main(String[] args) {
		Scanner enter = new Scanner(System.in);
		long n;

		while(enter.hasNext()) {
			n = enter.nextLong();                				
			System.out.println(n+"!");
 			System.out.println(recursive(n));  
			
		}
	}
	public static long recursive(long n) {  
		if(n==0)
			return 1;
		else
			return n*recursive(n);
	}
}
