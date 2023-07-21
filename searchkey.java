package practice;

import java.util.*;
public class searchkey {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int count=0;
		Scanner inp = new Scanner(System.in);
		int a= inp.nextInt();
		
		int arr[]= new int[a];
		for(int i=0; i<a;i++) {
			arr[i]=inp.nextInt();
		}
		int n=inp.nextInt();
		for(int i=0;i<a;i++) {
			if(arr[i]==arr[i]) {
				count=1;
				break;
			}
			
		}
			if(count==1) {
				System.out.println("Element is found");
			}
			else {
				System.out.print("Element is not found");
			}
		
		}

}
