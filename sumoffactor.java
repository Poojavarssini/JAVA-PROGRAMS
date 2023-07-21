package practice;
import java.util.*;
public class sumoffactor {
	public static void main(String args[]) {
		int sum=0;
		Scanner inp=new Scanner(System.in);
		int a = inp.nextInt();
		for(int i=1;i<=a;i++) {
			if(a%i==0) {
			    sum=sum+i;
			}
		}	
		        System.out.print("Sum: "+sum);
		 
      }

	}