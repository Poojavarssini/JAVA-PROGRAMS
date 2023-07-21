package practice;
import java.util.*;

public class adj {
	public static void main(String[] args) {
		Scanner inp = new Scanner(System.in);
		int arr[][]=new int[2][2];
		int r =0;
		int c =0;
		for(int i =0;i<arr.length;i++) {
			for(int j =0;j<arr.length;j++) {
				 arr[i][j]=inp.nextInt();
				 System.out.print(arr[i][j]+" ");
				 
			}
			System.out.println( );
			
		}
		for(int i =0;i<arr.length;i++) {
			for(int j =0;j<arr.length;j++) {
				if(i==0 &&j==0  ) {
					
					System.out.print(arr[1][1]);
					
				}
				else if( i==1&& j==1)
					System.out.println(arr[0][0]);
				else {
					arr[i][j]=arr[i][j]*-1;
					System.out.print(arr[i][j]+" ");		
				}
			
				
				
			}
				System.out.println();
			
		}
		
		
	}

}
