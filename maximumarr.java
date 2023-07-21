package practice;

import java.util.*;
public class maximumarr {
	public static void main(String args[]) {
		int sum1 = 0,sum2=0;
		Scanner inp = new Scanner(System.in);
		int a = inp.nextInt();
		int arr[]= new int[a];
		int b = inp.nextInt();
		int arr2[]= new int[b];
		for(int i=0;i<a;i++) {
			arr[i] = inp.nextInt();
		}
		for(int i=0;i<b;i++) {
			arr2[i] = inp.nextInt();
		}
		for(int i=0;i<a;i++) {        
			sum1+=arr[i];
		}
		for(int i=0;i<b;i++) {
			sum2+=arr2[i];
		}
		if(sum1<=sum2) {
			System.out.print(Arrays.toString(arr2)+" "+ sum2+" "+ sum1);
		}
		else {
			System.out.print(Arrays.toString(arr)+" "+sum1 );
		}
		
	}
}
