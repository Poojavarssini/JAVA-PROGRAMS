package test;
import java.util.*;
public class countsubarrays {
	public static void main(String[] args) {
		 int count=0;
       Scanner inp=new Scanner(System.in);
       int n=inp.nextInt();
       int arr[]=new int[n];
       for(int i=1;i<n;i++)
       {
    	   arr[i]=inp.nextInt();
       }
       for(int i=0;i<n;i++)
		 {
			 int a=(int) Math.sqrt(arr[i]);
			 if(a*a==arr[i])
			 {
				 count++;
			 }
		 }
		int temp=count;
		 System.out.print(temp);
	 } 
	}
