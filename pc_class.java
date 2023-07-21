package practice;
import java.util.*;
class parent{
	public void one() {
		System.out.println("This is Parent class");
	}
}

class child extends parent{
	public void two() {
		System.out.println("This is child class");
	}
}

public class pc_class {
	public static void main(String args[]) {
		parent a = new parent();
		child b = new child();
		a.one();
		b.two();
		b.one();
	}

}
