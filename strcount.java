package practice;

import java.util.*;
public class strcount {
	public static void main(String args[]) {
		int count=0;
		Scanner inp = new Scanner(System.in);
		String str = inp.nextLine();
		char ch=inp.next().charAt(0);
		char arr[]=str.toCharArray();
		for(int i=0;i<str.length();i++) {
			if(arr[i]==ch) {
				count++;
			}
		}
		System.out.println(count);
	}

}
