package test;
import java.util.*;
/*public class max {
	public static void main(String args[]) {
		Scanner inp= new Scanner(System.in);
		
	}

}*/
import java.util.*;
import java.util.Scanner;
public class max {
	    public static void main(String[] args) {
	        Scanner inp = new Scanner(System.in);
	        int n = inp.nextInt();
	        int q = inp.nextInt();
	        int arr[] = new int[n+1];
	        for (int i = 1; i <= n; i++) {
	            arr[i] = inp.nextInt();
	        }
	        while (q-- > 0) {
	            int l = inp.nextInt();
	            int r = inp.nextInt();
	            int arr2[] = new int[n+1];
	            for (int i = l; i <= r; i++) {
	                arr2[arr[i]]++;
	            }
	            int result = 0;
	            for (int i = 1; i <= n; i++) {
	                if (arr2[i] == 0) {
	                    result = i;
	                    break;
	                }
	            }
	            System.out.println(result);
	        }
	    }
	}
