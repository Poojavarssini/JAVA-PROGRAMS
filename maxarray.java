/*package practice;

import java.util.*;
public class maxarray {
	public static void main(String args[]) {
		int max =1;
		Scanner inp = new Scanner(System.in);
		int a = inp.nextInt();
		int arr[]= new int[a];
		for(int i=0;i<a;i++) {
			arr[i] = inp.nextInt();
		}
		for(int i=0;i<a;i++) {

			if(max<arr[i]) {
                max=arr[i];
			}
		}
		
	System.out.print(max);
	}

}*/
package practice;
import java.util.*;
public class maxarray{
    public static void main(String args[]){
        Scanner inp = new Scanner(System.in);
        int max=1, min=1;
        int n = inp.nextInt();
        int arr[] = new int[n];
        for(int i=0;i<n;i++){
            arr[i] = inp.nextInt();
        }
         for(int i=0;i<n;i++){
             if(max<arr[i]){
                 max = arr[i];
             }
         } 
            System.out.println("Max:" +max);
             for(int i=0;i<n;i++){
             if(min>arr[i]){
                 min = arr[i];
             }
         } 
            System.out.println("Min:" +min);
            
    }
}

