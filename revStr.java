package test;
import java.util.*;
public class revStr {
	public static void main(String[ ] arg)
	{
	Scanner inp=new Scanner(System.in);
	System.out.print("Enter a string : ");
	String str=inp.nextLine();	
	char[] ch=str.toCharArray(); 
	System.out.println("Reverse of a String is :"); 
	for(int i=ch.length;i>0;i--)
	{
	System.out.print(ch[i-1]); 
	}
	}
}