package practice;

import java.util.*;

class box
{
	float h ;
	float b;
	float d;	
	box()
	{
		Scanner inp = new Scanner(System.in);
		h = inp.nextFloat();
		b = inp.nextFloat();
		d = inp.nextFloat();
		float vol = h*b*d;
		System.out.println(vol);
	}
	
}

public class cstruct
{
	public static void main(String[] args)
	{
		box newbox = new box();
		
	}
	
	

}