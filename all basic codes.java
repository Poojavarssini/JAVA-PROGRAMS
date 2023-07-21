package placement;

//int - ARRAY:
/*import java.util.*;
public class examples {
public static void main(String args[]) {
	int numbers[] = new int[] {10,20,30,40};
	int number1[][] = {{1,2}, {3,4}};
	numbers[0]=10;
	numbers[1]=20;
	numbers[2]=30;                 
	System.out.println(numbers[2]);    //sysout.print(Arrays.toString(numbers));
    System.out.println(Arrays.toString(number1));
}
}*/

//char
/*import java.util.*;
public class examples{
	public static void main(String args[]) {
	char name[]= {'a', 'b', 'c','d'};
	int len=name.length;
	System.out.print(len);
}
}*/

//cloning
/*import java.util.*;
public class examples{
	public static void main(String args[]) {
	char name[]= {'a', 'b', 'c','d'};
	char name1[]= name.clone();
	System.out.print(name1);
}
}*/

//STRINGS & Concatenation:
/*import java.util.*;
public class examples{
	public static void main(String args[]) {
		System.out.println("Harry Potter");
		System.out.println("Harry" + " Potter1");
	}
}*/

//len
/*import java.util.*;
public class examples{
	public static void main(String args[]) {
		String Petname = "jack";
		System.out.println(Petname);
		System.out.println(Petname.length());    //startswith,trim()
	}
}*/

// 2methods to print len:
/*import java.util.*;
public class examples{
	public static void main(String args[]) {
		String petname = "jack";
		int len = petname.length();
	    System.out.println(len);
		System.out.println(petname.length());
	}
}*/

//OPERATORS: 2methods
/*import java.util.*;
public class examples{
	public static void main(String args[]) {
		 int age=17;
		 boolean indiancitizenship=true;
		 String name= age>=18? "eligible" : "not eligible";    //single line
		 System.out.println(name);
		 if(age>=18) {                                         //using if clause
			 System.out.println("eligible");
		 }
		 else {
			 System.out.println("not eligible");
		 }
	   }
}*/

//SCANNER:
/*import java.util.Scanner;
public class examples{
	public static void main(String args[]) {
		Scanner number = new Scanner(System.in);            /*or
		                                               int value = number.nextInt();
													   System.out.println(value); */                                            
		/*System.out.println("enter a value:");
		 int value = number.nextInt();
		System.out.println("entered value: "+ value);
		Scanner input = new Scanner(System.in);
		System.out.println("enter a name:");
		String name = input.next();
		System.out.println("Hello " + name);
		System.out.println(name +" " +name.length()+" "+ name.toLowerCase()+" "+ name.toUpperCase());
	}
}*/

//if conditions:
/*
import java.util.*;
public class examples{
	public static void main(String args[]) {
		int icecream = 20;
		int splIcecream =30;
		int cost;
		Scanner input = new Scanner(System.in);
		System.out.println("enter a cost:");
		cost=input.nextInt();
		if(cost > splIcecream) {
			System.out.println("U can buy splIcecream");
		}
		else if(cost > icecream) {
			System.out.println("U can buy icecream");
			}
		else {
			System.out.println("U cant buy icecream :(");
		}
	}
}*/


//SWITCH:
/*import java.util.*;
public class examples{
	public static void main(String args[]) {
		Scanner input= new Scanner(System.in);         //direct::String name = "Pooja";
		System.out.println("Enter ur name:");
		String name = input.nextLine();
		switch(name) {
		case "akhil":
			System.out.println("Hi "+ name);
			break;
		case "pk":
			System.out.println("Hi "+ name);
			break;
		case "jack":
			System.out.println("Hi "+ name);
			break;
		case "Pooja":
			System.out.println("Hi "+ name);
			break;
			default:
				System.out.println("Name is not found");
		}
		}
	}*/

//LOOPS:
import java.util.*;
public class examples{
	public static void main(String args[]) {
		for(int i=0; i<5; i++) {
			System.out.println("hi jack");
		}
		
		//reverse:
		for(int i=5; i>0; i--) {
			System.out.println("hello");
		}
		
		//while:
		int num = 3;
		while(num>0) {
			System.out.println("while");
			num--;
		}
		while(num<5) {
			System.out.println("while loop");
			num++;
		}
		
		//do while:
		int num1 = 3;
		do {
			System.out.println("do while loop");
			num1--;
		}
		while(num1>0);                         //while(num1>10); =>condition false so runs 1 time
	                                          //o/p : do while loop
		
	   //for each loop:
		String Icecream[] = {"vanilla", "strawberry", "butterscotch"};
		for(String Icream : Icecream) {
			System.out.println(Icream);
		}
		for(int i=0; i<Icecream.length;i++) {
			System.out.println(Icecream[i]);
		}
	}
}




