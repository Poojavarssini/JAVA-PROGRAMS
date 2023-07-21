package test;
import java.util.*;
public class guest {
    public static void main (String[]args){ 
    	 int max = 0, sum = 0;
        Scanner sc = new Scanner (System.in);
        int a = sc.nextInt ();
        int E[] = new int[a];
        int L[] = new int[a];

        for (int i = 0; i < a; i++)
            E[i] = sc.nextInt ();
        for (int i = 0; i < a; i++)
            L[i] = sc.nextInt ();
        for (int i = 0; i < a; i++){
	        sum += E[i]-L[i];
	        max = Math.max (sum, max);
        }
    }
}