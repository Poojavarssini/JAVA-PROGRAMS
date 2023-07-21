package practice;
import java.util.*;

public class totalperson{
	public static void main(String args[]) {
		System.out.println("Total persons in a room: ");
		Scanner inp=new Scanner(System.in);
		int num = inp.nextInt();
		int total;	
		System.out.println("Maximum number of handshakes: ");
		total = (num*(num-1))/2;
		System.out.println(total);
		}
}

















