import java.util.*;
class Student
{
 static Scanner sc=new Scanner(System.in);
 int sid;
 String sname;
 float smarks;
 Student(int id,String name,float marks)
 {
    sid=id;
    sname=name;
    smarks=marks;
    
 }
 Student(Student v)
 {
   this.sid=v.sid;
   this.sname=v.sname;
   this.smarks=v.smarks;
   
 }
 public static void main(String[] args)
 {
    Student v=new Student(sc.nextInt(),sc.next(),sc.nextFloat());
    Student v1=new Student(v);
    System.out.println("original vlaues");
    System.out.println(v.sid+" "+v.sname+" "+v.smarks);
    System.out.println("copied values");
    System.out.println(v1.sid+" "+v1.sname+" "+v1.smarks);
 }
 
}
