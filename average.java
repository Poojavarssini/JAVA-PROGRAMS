package placement;

import java.util.*;
public class average {
	public static void main(String args[]) {
		Scanner input= new Scanner(System.in);
		System.out.println("enter 1st num: ");
		int num1= input.nextInt();
		System.out.println("enter 2nd num: ");
		int num2= input.nextInt();
		System.out.println("enter 3rd num: ");
		int num3= input.nextInt();
		System.out.println("Average of num:"+ ((num1+num2+num3)/3));
	}
}
