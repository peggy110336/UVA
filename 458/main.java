package UVA458;

import java.util.Scanner;

public class main {

	public static void main(String[] args) {
		Scanner enter = new Scanner(System.in);
		String s;
		
		while(enter.hasNext()) {
			s = enter.nextLine();
			for(int i=0;i<s.length();i++) {
				System.out.print((char)(s.charAt(i)-7));
			}
			System.out.println();
		}

	}

}
