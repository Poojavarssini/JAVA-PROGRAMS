package test;
import java.util.*;

public class profitloss {
	public static void main(String args[])
	{
		Scanner pk = new Scanner(System.in);
		int price[]= {6,1,4,2,5,3};
		int k =pk.nextInt();
		int profit=0;
		for(int j=0;j<k;j++)
		{
			int buy =0;
			int sel =0;
			for(int i=0,z=i+1;i<price.length;i++)
			{
				if(price[i]<price[z] )
				{
					buy=price[i];
				}
				if(buy!=0)
				{
					if(price[i]>buy)
					{
						sel=price[i];
					}
				}
				profit =profit + sel-buy;
				
			}
		}
		System.out.println(profit);
	}

}
