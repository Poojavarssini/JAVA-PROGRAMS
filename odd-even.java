package practice;

import java.util.*;
public class oe {
	public static void main(String args[]) {
		Scanner inp = new Scanner(System.in);
		int n = inp.nextInt();
		int arr[] = new int[n];
		int b[] = new int[n];
		for(int i=0;i<arr.length;i++) {
			arr[i]=inp.nextInt();
		}
		char ch1='E';
		char ch2='O';
		char ch3='B';
		
		for(int i=0;i<b.length;i++) {
			if(arr[i]==0) {
				b[i]=ch3;
				System.out.print(ch3+" ");
			}
		    
			else if(arr[i]%2==0) {
					b[i]=ch1;
					System.out.print(ch1+" ");
			 }
		   
			else if(arr[i]%2!=0) {
				b[i]=ch2;
				System.out.print(ch2+" ");
			}
		    
			 
		  
		    
		}
		
	}

}
