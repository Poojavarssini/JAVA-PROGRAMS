package practice;

import java.util.*;
public class withoutinbuilt {
		   public static void main(String args[]) {
		      Scanner inp = new Scanner(System.in);
		      String str = inp.nextLine();
		      int i = 0;
		      for(char c: str.toCharArray()) {
		         i++;
		      }
		      System.out.println("Length of the given string :"+i);
		   }
		}

