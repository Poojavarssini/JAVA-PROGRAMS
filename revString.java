package test;

import java.util.*;
public class revString{
  public static void main(String[] args) {
    Scanner inp = new Scanner(System.in);
    System.out.println("Enter a String: ");
    String str = inp.nextLine();
    System.out.println("Reversed String is: ");
    String a[] = str.split("\\s");
    String revString = "";
    
    for (int i = a.length-1; i>=0; i--) { 
              revString =revString+ a[i] + " "; 
          //    revString = " " + a[i] + revString; 
        } 
 
    System.out.print(revString);
  }
}