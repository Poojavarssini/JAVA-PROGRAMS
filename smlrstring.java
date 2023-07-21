package test;

import java.util.*;

public class smlrstring {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        System.out.println("Enter a string: ");
        String words = inp.nextLine();
        String[] a= words.split("\\s+");
        
        String smallest = a[0];
        String largest = a[0];

   
        for (int i = 1; i < a.length; i++) {
            if (a[i].length() < smallest.length()) {
                smallest = a[i];
            }
            if (a[i].length() > largest.length()) {
                largest = a[i];
            }
        }

      
        System.out.println("Smallest word: " + smallest);
        System.out.println("Largest word: " + largest);
    }
}
