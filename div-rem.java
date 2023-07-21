package practice;

import java.util.*;
public class div {
	public static void main(String args[]) {
		Scanner inp = new Scanner(System.in);
		int n = inp.nextInt();
		int x = inp.nextInt();
		int y = inp.nextInt();
		for(int i=1;i<n;i++) {
			if(i%x==0 && i%y!=0) {
				System.out.print(i+" ");
				
			}
		}
	}

}
