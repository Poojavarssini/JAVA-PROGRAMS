package practice;

import java.util.*;
public class vowels {
	public static void main(String args[]) {
		Scanner inp=new Scanner(System.in);
		int count =0;
		String str = inp.nextLine();
		char ch[] = str.toCharArray() ;
		for(int i=0;i<ch.length;i++) {
			//System.out.print(ch[i]);
			if(ch[i]=='a' || ch[i]=='e'  || ch[i]=='i' || ch[i]== 'o' || ch[i]=='u' ) {
				count++;
			}
		}
		System.out.println(count);
	}
}
