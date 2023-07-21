package practice;
import java.util.*;
class rectangle1
{
void display()
{
 Scanner my=new Scanner(System.in);
 int l=my.nextInt();
 int b=my.nextInt();
 int Area=l*b;
 System.out.println(Area);
}
}
class square1 extends rectangle1
{
void display1()
{
 Scanner my1=new Scanner(System.in);
 int l1=my1.nextInt();
 int Area1=l1*l1;
 System.out.println(Area1);
}
}
class circle1 extends rectangle1
{
void display2()
{
 Scanner my2=new Scanner(System.in);
 float PI=3.14f;
 int l2=my2.nextInt();
 double Area2 = 2*PI*l2*l2;
 System.out.println(Area2);
}
}
class shapes2
{
 public static void main(String[]args)
{
 /*square s=new square();
 s.display1();
 s.display();*/
 circle1 c = new circle1();
 square s = new square();
 c.display();
 s.display();
 s.display1();
 c.display2();
}
}