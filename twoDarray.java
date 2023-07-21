package practice;

import java.util.*;
public class twoDarray {
	public static void main(String args[]) {
		Scanner inp= new Scanner(System.in);
		int a = inp.nextInt();
		int b = inp.nextInt();
		int arr[][]= new int[a][b];
		for(int i=0;i<a;i++) {
			for(int j=0;j<b;j++) {
				arr[i][j]= inp.nextInt();
			}
		}
			for(int i=0;i<a;i++) {
				for(int j=0;j<b;j++) {
					System.out.print(arr[i][j]+" ");
			}
			System.out.println();
		}
	}

}
