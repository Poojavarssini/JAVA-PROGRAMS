package practice;

import java.util.*;
public class searchchar {
	public static void main(String args[]) {
		int count=0;
		Scanner inp = new Scanner(System.in);
		char ch=inp.next().charAt(0);
		String str = inp.nextLine();
		str = inp.nextLine();
		char arr[] = str.toCharArray();
		
		for(int i=0;i<arr.length;i++) {
			
			if(arr[i]==ch) {
				count=1;
				break;
			}
			
		}
		if(count==1) {
		System.out.println("Present");
	}
		else {
			System.out.println("Not present");
		}

}
}
