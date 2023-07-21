package practice;

import java.util.*;
public class sumarr2 {
	public static void main(String args[]) {
		Scanner inp=new Scanner(System.in);
		int n= inp.nextInt();
		int arr[]= new int[n];
		for(int i=0;i<n;i++) {
			arr[i]=inp.nextInt();
		}
		int num=inp.nextInt();
		int count=0;
		 for (int i=0; i<n-1; i++)
		    {
		      for (int j=i+1; j<n; j++)
		        {
		            if(arr[i]+arr[j]==num)
		            {
		              // System.out.println(arr[i]+"+"+arr[j]+"="+num);
		               count=1;
		            }
		           else if(arr[i]+arr[j]!=num) {
		          	//System.out.println("NO match is found");
		        	   count=0;
		            }
		            
		        }
		    }
		 if(count==1) {
			 System.out.println("true");
		 }
		 else {
			 System.out.println("No match is found");
		 }
		 
	
	}

}
