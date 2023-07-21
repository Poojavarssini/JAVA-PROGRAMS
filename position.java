package practice;

import java.util.*;
public class position {
	public static void main(String args[]) {
		int pos=0;
		Scanner inp = new Scanner(System.in);
		int a = inp.nextInt();
		int arr[]= new int[a];
		for(int i=0;i<a;i++) {
			arr[i]= inp.nextInt();
		}
		int b = inp.nextInt();
		
		for(int i=pos-1;i<arr[i]+1;i++) {
			int temp = arr[i];
			arr[i]=b;
		}
		
    }
}