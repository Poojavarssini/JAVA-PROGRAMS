package practice;

import java.util.*;
public class duplicatewords
{
        public static void main(String args[])
        {
             Scanner obj=new Scanner(System.in);
             String s=obj.nextLine();
             int i,j;
             String arr[]=s.split(" ");
             for(i=0;i<arr.length;i++)
             {
                for(j=i+1;j<arr.length;j++)
                {
                    if(arr[i].equals(arr[j]) && (arr[i]!=" "))
                    {
                        System.out.println(arr[i]);
                        break;
                    }
                }
             }
        }
}
