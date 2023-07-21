package practice;

import java.util.*;
public class singdoub {
	public static void main(String args[]) {
		Scanner inp = new Scanner(System.in);
		int n = inp.nextInt();
		int arr[]= new int[n];
		int b[]=new int[n];
		for(int i=0;i<arr.length;i++) {
			arr[i]=inp.nextInt();
		}
		char ch1='S';
		char ch2='D';
		for(int i=0;i<b.length;i++) {
			//b[i]=i+1;
			if(arr[i]<=9) {
				//System.out.println(arr[i]+": "+"S");
				b[i]=ch1;
				System.out.print(ch1+" ");
			}
			if(arr[i]>9) {
				//System.out.println(arr[i]+": "+"D");
				b[i]=ch2;
				System.out.print(ch2+" ");
			}
		
		}
		
	}

}
