import java.util.*;
class Student
{
    int id;
    String name;
    int marks;
    Student(int id,String name,int marks)
    {
        this.id=id;
        this.name=name;
        this.marks=marks;
    }
    Student(Student st)
    {
        System.out.println("Original Values "+id+" "+name+" "+marks);
        System.out.println("Copied Values "+st.id+" "+st.name+" "+st.marks);

    }
    public static void main(String []args)
    {
        Scanner sc = new Scanner(System.in);
        Student st = new Student(sc.nextInt(),sc.next(),sc.nextInt());
	System.out.println(st.id+" "+st.name+" "+st.marks);
        Student s=new Student(st);
  }
}