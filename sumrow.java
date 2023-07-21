package practice;

import java.util.*;
public class sumrow {
	public static void main(String args[]) {
		Scanner inp = new Scanner(System.in);
		int row,col,sum=0;
		row = inp.nextInt();
		col = inp.nextInt();
		int s[][]= new int[row][col];
		
		for(int i=0;i<row;i++) {
			for(int j=0;j<col;j++) {
				s[i][j]=inp.nextInt();
		   }
		}
		
		for(int i=0;i<s.length;i++) {
			for(int j=0;j<s[0].length;j++) {
			sum+=s[i][j];
		}
			System.out.println("sum of matrix "+i+" row= "+sum);
	 }

   }

}