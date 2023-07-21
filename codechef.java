package practice;
import java.util.*;
public class codechef {


	
		public static void main (String[] args) throws java.lang.Exception
		{
			
				int count =0;
			Scanner inp = new Scanner(System.in);
		
			int n=inp.nextInt();
			int arr[]=new int[n];
			for(int i=0;i<n;i++){
			    arr[i]=inp.nextInt();
			}
			for(int i=0;i<n;i++){
			 if(arr[i]>=10){
			        count++;
			 }
			    }
		      System.out.println(count);
			     
		}
	}
