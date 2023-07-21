package practice;

import java.util.*;
public class newtwoarr {
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
					c[0]=a[0]+b[1]+1;
				}
				else if(i==1)
				{
					c[1]=a[1]+b[0]+1;
				}
				else if(i==2)
				{
					c[2]=a[2]+b[2]-2;
				}
				else if(i==3) {
					c[3]=a[3]+b[3];
				}
				else if(i==4){
					
					c[4]=a[4]+b[4]+2;
				}
               else if(i==5){
					
					c[5]=a[5]+b[6]-1;
				}
               else{
					
					c[6]=a[6]+b[5]-1;
				}
				System.out.print(c[i]+" ");
			}
				
			}
		}
