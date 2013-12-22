//uva10041
import java.util.*;

public class Main {	
	public static void main(String[] args) {
		
		Scanner enter = new Scanner(System.in);
		int a[],n,d,m,sum=0;
		n = enter.nextInt();

		for(int i=0;i<n;i++) {
			if(n>500)
				break;

			d = enter.nextInt();
			if(d>3000)
				break;
			
			a = new int[d];			
			for(int j=0;j<a.length;j++) {
				a[j] = enter.nextInt();
			}
			
			Arrays.sort(a);
			m = a[d/2];
			
			for(int j=0;j<a.length;j++) {
				sum+=Math.abs(a[j]-m);
			}
			System.out.println(sum);
			sum=0;
		}
		
	}
}
