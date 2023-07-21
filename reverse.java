package practice;

import java.util.*;
public class reverse {
	public static void main(String args[]) {
		int rem=0,rev=0,product=1;
		Scanner inp = new Scanner(System.in);
		int a = inp.nextInt();
		while(a!=0){
			rem = a%10;
			rev = (rev*10)+rem;
		    product = product*rem;
			a/=10;
		}
		System.out.print(product);
		}
		
	}

