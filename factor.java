package practice;
import java.util.*;
public class factor {
	public static void main(String args[]) {
		Scanner inp=new Scanner(System.in);
		int a = inp.nextInt();
		for(int i=1;i<=a;i++) {
			if(a%i==0) {
				System.out.print(i+",");
		}
		
      }
	}

}