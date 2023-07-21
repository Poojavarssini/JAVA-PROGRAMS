package practice;

import java.util.*;
public class primeno {
	public static void main(String args[]) {
		int count=0;
		Scanner inp = new Scanner(System.in);
		int a = inp.nextInt();
		for(int i=2; i<=a;i++) {
			if(a%i != 0)
		    {
		       count=1;
				}
			else {
				count=0;
			}
		}
			if(count==1) {
				System.out.print("Prime");
			}
			else {
				System.out.print(" Not Prime");
			} 
		}
}