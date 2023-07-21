package test;
import java.util.*;

public class perfectsq {
	public static void main(String[] args) {
		Scanner inp = new Scanner (System.in);
		
	        int n = inp.nextInt();
	        int arr[] = new int[n];
	        int temp=0;
	        for (int i = 0; i < n; i++) {
	            arr[i] = inp.nextInt();
	        }
	        for (int i = 0; i < n; i++) {
	            int a = (int) Math.sqrt(arr[i]);
	            if (a * a == arr[i]) {
	                temp++;
	            }
	        }
	        int result= temp;
	        System.out.println(result);
	    }

}