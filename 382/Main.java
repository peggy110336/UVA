//UVA382;
import java.util.*;
public class Main {

	public static void main(String[] args) {
		Scanner enter = new Scanner(System.in);
		int n;
		
		System.out.println("PERFECTION OUTPUT");
		while(enter.hasNext()) {
			n = enter.nextInt();
			
			if(n==0) {
				System.out.println("END OF OUTPUT");
				break;
			}
			
			if(factor_sum(n) > n)
				System.out.printf("%5d ABUNDANT",n);
			else if(factor_sum(n) == n)
				System.out.printf("%5d PERFECT",n);
			else
				System.out.printf("%5d DEFICIENT",n);
		}
	}
	public static int factor_sum(int a) {
		int sum = 0;
		for(int i=1;i<a;i++) {
			if(a%i==0)
				sum+=i;
		}
		return sum;
	}

}
