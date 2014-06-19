//UVA382;
import java.util.*;
public class Main {

	public static void main(String[] args) {
		Scanner enter = new Scanner(System.in);
		int n;
		
		while(enter.hasNext()) {
			System.out.println("PERFECTION OUTPUT");
			n = enter.nextInt();
			
			if(n==0)
				System.out.println("END OF OUTPUT");
			
			if(factor_sum(n) > n)
				System.out.println(n + " ABUNDANT");
			else if(factor_sum(n) == n)
				System.out.println(n + " PERFECT");
			else
				System.out.println(n + " DEFICIENT");
		}
	}
	public static int factor_sum(int a) {
		int sum = 0;
		for(int i=1;i<=a;i++) {
			if(a%i==0)
				sum+=i;
		}
		return sum;
	}

}
