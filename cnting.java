package practice;

import java.util.*;
public class cnting {
	public static void main(String args[]) {
		int count =0,rem=0;
		Scanner inp = new Scanner(System.in);
		int a = inp.nextInt();
		int b = inp.nextInt();
		while(a>0) {
			rem = a%10;
			if(rem==b) {
				count++;
			}
			a/=10;
		}
		System.out.println(count);
	}
	
}

