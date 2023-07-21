package test;

import java.util.*;
public class palindrome {
	public static void main(String args[]) {
		Scanner inp = new Scanner(System.in);
		int a = inp.nextInt();
		int rem=0,rev=0,temp;
		temp=a;
		while(a!=0) {
			rem = a%10;
			rev = rev*10+rem;
			a/=10;
		}
		if(temp==rev) {
			System.out.println("palindrome");
		}
		else {
			System.out.println("not palindrome");
		}
	}

}
