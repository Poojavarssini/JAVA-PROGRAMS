package test;
import java.util.*;

public class bulbs {
	public static void main(String args[]) {
	   int count = 0;
    	Scanner inp = new Scanner(System.in);
        int n = inp.nextInt();
        int arr[] = new int[n];
        for(int i =0; i<n;i++) {
        	arr[i]=inp.nextInt();
        }
        for (int i=0;i<n;i++) {
            if (arr[i]==0&&(i==0||arr[i-1]==1)) {
                for (int j=i;j<n;j++) {
                    arr[j]=1-arr[j];
                }
                count++;
            }
        }
        System.out.println(count);
        
        

	}
   
}










