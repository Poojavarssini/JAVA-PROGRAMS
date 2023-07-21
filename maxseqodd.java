package placement;

import java.util.*;
public class maxseqodd {
	public static void main(String args[]) {
		
		int arr[] = {1,3,15,19,4,17,101,37,40};
		int maxOdd = 0, ans=0;
		
		for(int i=0;i<arr.length;i++){
			
			if(maxOdd < arr[i] && arr[i]%2 != 0) {
				maxOdd = arr[i];
				ans = maxOdd;
			}
		}
		
		System.out.println(maxOdd);
	}
	
}
