package test;

import java.util.*;
import java.util.Scanner;
public class socks {
	
    public static void main(String[] args) {
        int count = 0;
        Scanner inp = new Scanner(System.in);
        int a = inp.nextInt();
        int arr[] = new int[a];
        for (int i = 0; i < a; i++) {
            arr[i] = inp.nextInt();
        } Arrays.sort(arr);
        for (int i=0; i<a-1; i++) {
            if (i<a &&arr[i] == arr[i+1]) {
                count++;
                i=i+1;
            }
        }
        System.out.println(count);
 
    }
}