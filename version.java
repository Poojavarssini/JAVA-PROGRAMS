package test;
import java.util.*;

public class version {
	public static void main(String args[])
	{
		Scanner pk =new Scanner(System.in);
		String version1= pk.next();
		String version2= pk.next();
		char v1[]=version1.toCharArray();
		char v2[]=version2.toCharArray();
		int c1=0;
		String temp = "";
		String temp1="";
		for(int i=0;i<v1.length;i++)
		{
			if(v1[i]=='.')
			{
				if(v1[i+1]=='0')
				{
					System.out.println("abc");
					for(int j=i+1;v1[j]=='0';j++)
					{
						v1[j]=0;
					}
				}
			}
		}
		for(int i=0;i<v1.length;i++)
		{
			
			if(v1[i]!='.' && v1[i]!=0)
			{
				temp = temp + v1[i];      // s = 1
			}
		}
		for(int i=0;i<v2.length;i++)
		{
			if(v2[i]=='.')
			{
				if(v2[i+1]=='0')
				{
					//System.out.println("abc");
					for(int j=i+1;v2[j]=='0';j++)
					{
						v2[j]=0;
					}
				}
			}
		}
		for(int i=0;i<v2.length;i++)
		{
			
			if(v2[i]!='.' && v2[i]!=0)
			{
				temp1 = temp1 + v2[i];      // s = 1
			}
		}
		int n=Integer.parseInt(temp);
		int n2=Integer.parseInt(temp1);
		
		if(n==n2) {
			System.out.println("Equal");
		}
		if(n>n2) {
			System.out.println("v1");
		}else if(n<n2) {
			System.out.println("v2");
		}
		
	}
}
