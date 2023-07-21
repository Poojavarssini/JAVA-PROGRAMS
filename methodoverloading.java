package practice;

import java.util.*;
public class methodoverloading{
static int methodo (int x,int y) {
	return x+y;
}
static double  methodo(double x,double y) {
	return x+y;
}
public static void main(String args[]) {
	int myNum1=methodo(8,5);
	double myNum2=methodo(4.3,5.25);
	System.out.println("int: "+myNum1);
	System.out.println("double: "+myNum2);
}
}