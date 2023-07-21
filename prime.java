package placement;

import java.util.Scanner;
class prime
{
	public static void main(String args[]) 
	{
	    Scanner obj = new Scanner(System.in);
	    int prime=0;
		int num = obj.nextInt();
		for(int i=2;i<=num;i++)
		{
		    if(num%i==0)
		    {
		      prime=i;
		      num=num/i;
		      i=1;
		    }
		}
		System.out.println(prime);
	}
}