package test;

import java.util.*;
public class downpattern{
    public static void main (String args[])
    {
        Scanner inp= new Scanner (System.in);
        int a=inp.nextInt();
        int b=inp.nextInt();

        for (int i=a; i>0; i--) {
            for (int j=b; j>i; j--) 
                 System.out.print(j); 
 
         for (int j=i; j>0; j--) 
                System.out.print(i); 
         
               System.out.println(); 
              }
        }
   }