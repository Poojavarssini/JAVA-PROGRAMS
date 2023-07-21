package test;

import java.util.*;
public class arr {
	public static void main(String args[]) {
		Scanner inp=new Scanner(System.in);
		int n=inp.nextInt();
		int arr[]=new int[n];
		for(int i=0;i<n;i++) {
			arr[i]=inp.nextInt();
		}
		int n1=inp.nextInt();
		int brr[]=new int[n1];
		for(int i=0;i<n1;i++) {
			brr[i]=inp.nextInt();
		}
		Arrays.sort(arr);
		for(int i=0;i<n;i++) {
			if(brr[i]==arr[i]&& arr[i]!='') {
				System.out.print(arr[i]+"");
			}
		}
	}

}
