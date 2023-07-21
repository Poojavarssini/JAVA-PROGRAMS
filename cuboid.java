package practice;

import java.util.*;
class rect{
	Scanner inp = new Scanner(System.in);
	int l = inp.nextInt();
	int b = inp.nextInt();
	int h = inp.nextInt();
	int volume = l*b*h;
	
}
public class cuboid {
	public static void main(String args[]) {
		rect cuboid = new rect();
		System.out.println(cuboid.volume);
		
	}
}
