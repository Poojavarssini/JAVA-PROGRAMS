package test;

import java.util.*;
public class thirdmax {
	public static void main(String[] args) {
		Scanner inp = new Scanner(System.in);

		int row = inp.nextInt();
		int col = inp.nextInt();
		int arr[][] = new int [row][col];
		for(int i =0; i<row;i++) {
			for(int j =0; j<col;j++) {
				arr[i][j]=inp.nextInt();
				System.out.print(arr[i][j]+" ");
			}
			System.out.println();
		}
	    int max=0;
		int maxcount =0;
		for(int i =0;i<row;i++) {
			int count =0;
			for(int j =0;j<col;j++) {
				if(arr[i][j]==1) {
					count++;
				}
			}
			if(count>maxcount) {
				maxcount = count;
				max = i;
				
			}
		}
		System.out.println("max in the row: " + (max+1));
		
	}

}