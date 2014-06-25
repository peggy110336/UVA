package UVA458;

import java.util.Scanner;

public class main {

	public static void main(String[] args) throws InterruptedException {
		Scanner enter = new Scanner(System.in);
		String s;
		char c;
		
		while(enter.hasNext()) {
			s = enter.nextLine();
			for(int i=0;i<s.length();i++) {
				c = (char)(s.charAt(i)-7);
				if((s.charAt(i)-7)>0)
					System.out.write( c );
			}
			System.out.println();
		}

	}

}
