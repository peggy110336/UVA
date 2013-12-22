//uva10190
import java.util.*;

public class Main {	
	public static void main(String[] args) {
		
		Scanner enter = new Scanner(System.in);
		double n,m,d;
				
		while(enter.hasNext()) {
			n = enter.nextDouble();
			m = enter.nextDouble();
			d = n/m;
			
			if(Math.sqrt(n)%m==0 || Math.sqrt(d)%m==0) {
				if(n%m==0 && n>=1) {
					System.out.print((int)n+" ");
					n/=m;
				}
				System.out.print(1);
			}
			else
				System.out.println("Boring!");
			
		}
		
	}
}
