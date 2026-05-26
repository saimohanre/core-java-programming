import java.util.Scanner;
class D
{
 static Scanner sc=new Scanner(System.in);
 static int m1(float b)
 {
   System.out.println(b);
   return sc.nextInt();
 }
 String m2(double c)
 {
   System.out.println(c);
   return sc.next();
 }
 D()
 {
   System.out.println("default constructor");
 }
 public static void main(String[] args)
 {
    new D().m2(m1(sc.nextFloat()));
 }
 
}
