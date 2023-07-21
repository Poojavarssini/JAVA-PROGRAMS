package practice;
import java.util.*;

public class m
{
	public static void main (String args[])
	{
		Scanner inp = new Scanner(System.in);
		int n = inp.nextInt();
		
		for(int x=0;x<n;x++)
		{
			for(int y=0;y<n;y++)
			{
				if(y==0 || y==4 || (x==1 && y==1) || (x==1 &&y==3) || (x==2 && y==2)) 
				{
					System.out.print("*");
				}
				else
				{
					System.out.print(" ");
				}
				
			}
			System.out.println();

		}
	}
	
}