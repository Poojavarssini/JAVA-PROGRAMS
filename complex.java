package test;

import java.util.*;
public class complex {
	public static void main(String args[]) {
		
		System.out.println("Enter 1st real and img num");
		Scanner inp = new Scanner(System.in);
		int real1 = inp.nextInt();
		int img1 = inp.nextInt();
		
		System.out.println("Enter 2nd real and img num");
		int real2 = inp.nextInt();
		int img2 = inp.nextInt();
		
		System.out.println("Sum:");
		int r = real1+real2;
		int i = img1+img2;
		System.out.println(r+ "+" + i + "i");
		
		System.out.println("Diff:");
		int r1 = real1-real2;
		int i1 = real1-real2;
		System.out.println(r1+ "+" + i1 + "i");
		
		System.out.println("Mul:");
		int r2 = (real1 * real2) - (img1* img2);
        int i2= (real1 * img2) + (img1 * real2);
        System.out.println( r2 + "+" + i2 + "i");
		
	}

}
