package practice;

import java.util.*;
public class even {
	public static void main(String args[]) {
		int sum=0;
		Scanner inp = new Scanner(System.in);
		int a = inp.nextInt();
		for(int i=1;i<=a;i++) {
			if(i%2==0) {
				sum = sum + i;
			}
		}
		System.out.println(sum);
	}

}
