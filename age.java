package practice;

import java.util.*;
public class age {
	public static void main(String args[]) {
		Scanner inp=new Scanner(System.in);
		int n = inp.nextInt();
		int arr[]= new int[n];
		int fees=0;
		for(int i=0;i<n;i++) {
			arr[i]=inp.nextInt();
				if(arr[i]<=17) {
					 fees+=200;
				}
				else if(arr[i]<40) {
					fees+=400;
				}
				else if(arr[i]>=40) {
					fees+= 300;
				}
			}
		
		System.out.println(fees);
	}

}
