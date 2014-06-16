//UVA623;
import java.math.BigInteger;
import java.util.*;
public class Main {

	public static void main(String[] args) {
		Scanner enter = new Scanner(System.in);
		BigInteger n;
		int a;
		while(enter.hasNext()) {
			a = enter.nextInt();
			if(a<=1000) {                   
				n = BigInteger.valueOf(a);  
				System.out.println(n+"!");
 				System.out.println(recursive(n));  
			}
		}
	}
	public static BigInteger recursive(BigInteger n) {  
		if(n==BigInteger.ZERO)
			return BigInteger.ONE;
		else
			return n.multiply( recursive( n.subtract(BigInteger.ONE) ) );
	}
}
