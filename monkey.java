package practice;

import java.util.*;
public class monkey {
	public static void main(String args[]) {
		Scanner inp=new Scanner(System.in);
		int n = inp.nextInt();
		int k = inp.nextInt();
		int j = inp.nextInt();
		int m = inp.nextInt();
		int p = inp.nextInt();
		int total;
		if(n>0) {
		total=(m/k)+(p/j);
		System.out.println(n-total);
		}
		else {
			System.out.println("Invalid input");
		}
		
	}
}
