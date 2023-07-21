package practice;

import java.util.*;
public class twoarray {
		public static void main(String[] args) {
			Scanner sc=new Scanner(System.in);
			int n=sc.nextInt();
			int a[]=new int[n];
			int b[]=new int[n];
			int c[]=new int[n];
			//int d[]=new int[n];
			for(int i=0;i<n;i++)
			{
					a[i]=sc.nextInt();			
			}
			for(int i=0;i<n;i++)
			{
				b[i]=sc.nextInt();
			}
			for(int i=0;i<n;i++)
			{
				if(i==0)
				{
					c[0]=a[0]+b[1];
				}
				else if(i==1)
				{
					c[1]=a[1]+b[0];
				}
				else if(i==2)
				{
					c[2]=a[2]+b[2];
				}
				else if(i==3) {
					c[3]=a[4]+b[3];
				}
				else
				{
					c[4]=a[3]+b[4];
				}
				
				System.out.print(c[i]+" ");
			}
			System.out.println();
				char ch1='S';
				char ch2='D';
				for(int i=0;i<n;i++) {
				
					//b[i]=i+1;
					if(c[i]<=9) {
						//System.out.println(arr[i]+": "+"S");
						//d[i]=ch1;
						System.out.print(ch1+" ");
					}
					if(c[i]>9) {
						//System.out.println(arr[i]+": "+"D");
						//d[i]=ch2;
						System.out.print(ch2+" ");
					}
				
				}		
		}
	
	
}
