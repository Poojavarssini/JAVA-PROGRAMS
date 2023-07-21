package test;

import java.util.*;
public class repeated {
	public static void main(String args[]) {
		int count=0;
		Scanner inp = new Scanner(System.in);
		int a = inp.nextInt();
		int arr[] = new int[a];
		for(int i=0;i<a;i++) {
			arr[i] = inp.nextInt();
		}
		Arrays.sort(arr);
        for (int i=0; i<a-1; i++) {
            if (i<a &&arr[i] == arr[i+1]) {
                count++;
                i=i+1;
            }
        }
        System.out.println("Total Repeated elements: " +count);
        System.out.println("Repeated elements are: ");
        for(int i=1; i<a-1; i++) {
        	 if (i<a &&arr[i] == arr[i+1]) {
        		 System.out.print(arr[i]+" ");
        	 }
        }
        
		
 
    }

	}


