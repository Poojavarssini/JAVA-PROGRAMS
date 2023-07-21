package practice;
import java.util.*;
import java.util.Scanner;

	public class ComplexNum {
	    private double real;
	    private double imaginary;
	    
	    public ComplexNum(double r, double i) {
	        this.real = r;
	        this.imaginary = i;
	    }
	    
	    public ComplexNum() {
	        this.real = 0;
	        this.imaginary = 0;
	    }
	    
	    public void add(ComplexNum c) {
	        double r = this.real + c.real;
	        double i = this.imaginary + c.imaginary;
	        System.out.println(r + "+" + i + "i");
	    }
	    
	    public void subtract(ComplexNum c) {
	        double r = this.real - c.real;
	        double i = this.imaginary - c.imaginary;
	        System.out.println(r + "+" + i + "i");
	    }
	    
	    public void multiply(ComplexNum c) {
	        double r = (this.real * c.real) - (this.imaginary * c.imaginary);
	        double i = (this.real * c.imaginary) + (this.imaginary * c.real);
	        System.out.println(r + "+" + i + "i");
	    }
	    
	    public static void main(String[] args) {
	        Scanner sc = new Scanner(System.in);
	        
	        System.out.println("Enter the real and imaginary parts of the first complex number:");
	        double r1 = sc.nextDouble();
	        double i1 = sc.nextDouble();
	        ComplexNum c1 = new ComplexNum(r1, i1);
	        
	        System.out.println("Enter the real and imaginary parts of the second complex number:");
	        double r2 = sc.nextDouble();
	        double i2 = sc.nextDouble();
	        ComplexNum c2 = new ComplexNum(r2, i2);
	        
	        System.out.println("Sum:");
	        c1.add(c2);
	        System.out.println("Difference:");
	        c1.subtract(c2);
	        System.out.println("Product:");
	        c1.multiply(c2);
	    }
	}
