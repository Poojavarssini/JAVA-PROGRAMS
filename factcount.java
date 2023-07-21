package practice;

import java.util.*;
public class factcount {
	public static void main(String args[]) {
		Scanner inp = new Scanner(System.in);
		int n = inp.nextInt();
		int fact=1;
		for(int i=1;i<=n;i++) {
			fact = fact*i;
		}
		System.out.println(fact);
		
	}

}
