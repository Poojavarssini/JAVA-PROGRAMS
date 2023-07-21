package practice;

import java.util.*;
public class matrix {
	public static void main(String args[]) {
		Scanner inp = new Scanner(System.in);
		int row = inp.nextInt();
		int col =inp.nextInt();
		int a[][]= new int[row][col];
		for(int i=0;i<row;i++) {
			for(int j=0;j<col;j++) 
				a[i][j]=inp.nextInt();
			}
		
		
		System.out.println("Original");
		{
			for(int i=0;i<row;i++,System.out.println()) {
				for(int j = 0;j<col;j++)
					System.out.print(a[i][j]+" ");
			}
	
				System.out.println("after");
				{
			for(int i=0;i<col;i++,System.out.println()) {
				for(int j=0;j<row;j++)
					System.out.print(a[j][i]+" ");
			}
	}

		}
	}
	
}