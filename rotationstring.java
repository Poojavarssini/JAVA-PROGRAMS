package practice;
import java.util.*;
public class rotationstring

{
        public static void main(String args[])
        {
             Scanner obj=new Scanner(System.in);
             String str1 =obj.nextLine();
             String str2 =obj.nextLine();
             str1=str1.concat(str1);
                 if(str1.indexOf(str2)>0) 
                 {
                     System.out.println("str2 is the rotation of str1");
                 }   
                 else
                 {
                    System.out.println("str2 is not rotation of str1");
                 }
        }
}

