package practice;

import java.util.*;
public class avg {
	public static void main(String args[]) {
		int sum = 0,rem=0;
		int avrg;
		Scanner inp = new Scanner(System.in);
		int a = inp.nextInt();
		int arr[] = new int[a];
		for(int i=0;i<a;i++) {
			arr[i]=inp.nextInt();
		}
		for(int i=0;i<a;i++) {
			sum=sum+arr[i];
		}
		avrg = sum/a;
		rem  = sum%a;
		System.out.println(avrg+"."+rem);
		
		System.out.println("using method");
		System.out.println(avgg(arr));
	}
	
	static int avgg(int arr[]) {
		int a = arr.length;
		int avrg;
		int sum =0 ;
		for(int i=0;i<a;i++) {
			sum = sum+arr[i];
		}
		avrg = sum/a;
		return avrg;
		
	}

}
