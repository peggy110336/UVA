//cpe10402 Uva10008
import java.util.*;

public class Main {	
	public static void main(String[] args) {
		
		Scanner enter = new Scanner(System.in);
		int a,Max=0,compare;
		String s,r="";
		char c;
		int count[] = new int[26];
		
		a = enter.nextInt();
		
		for(int i=0;i<=a;i++) {
			s = enter.nextLine();
			s = s.replaceAll(" ", "");
			s = s.toUpperCase();
			
			for(int j=0;j<s.length();j++) {
				c =s.charAt(j);
				if(c>='A' && c<='Z')
				   count[c-'A']++;				
				Max++;
			}		 			
		}
		for(int i=Max;i>=0;i--) {
			for(int j='A';j<='Z';j++) {
				if(count[j-'A']==i && count[j-'A']!=0) {
					System.out.println((char)j+" "+i);
				}
				else 
					continue;				
			}
		}				
   }
}
