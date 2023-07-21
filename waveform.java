package test;

import java.util.*;
public class waveform {
	public static void main(String args[]) {
		Scanner inp = new Scanner(System.in);
		int m = inp.nextInt();
		int n = inp.nextInt();
		int arr[][] = new int[m][n];
		for(int i=0;i<m;i++) {
			for(int j=0;j<n;j++) {
				arr[i][j]=inp.nextInt();
			}
		}
	 for (int j=0; j<n; j++) {
	        if (j%2 == 0) {
	            for (int i=0; i<m; i++) {
	            System.out.print(arr[i][j] + " ");
	            }
	        }
	        else {
	            for (int i=m-1; i>=0; i--) {
	              System.out.print(arr[i][j] + " ");
	            }
	        }
	    }

	}
}
