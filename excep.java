package practice;

import java.util.*;
public class excep {
	public static void main(String args[]) {
		Scanner inp=new Scanner(System.in);
		int a=inp.nextInt();
		int b=inp.nextInt();
		int c=0;
		//c=a/b;
		try {
		  c=a/b;
		}
		catch(Exception e) {
			System.out.println("Error occured");
		}
		System.out.println(c);
		System.out.println("End prgm");
	}

}
