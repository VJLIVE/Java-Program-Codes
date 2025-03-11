public class Student
{
int id;
String name;
Student()
{
System.out.println("this a default constructer");
}
Student(int i,String n){
id=i;
name=n;
}
void Teacher()
{
System.out.println("This is a method overloading");
}
void Teacher(int a,int b)
{
int i,k;
i=a;
k=b;
System.out.println(i+k);
}
public static void main(String[] args)
{
Student s = new Student();
System.out.println("\nDefault Constructor values:\n");
System.out.println("\nStudentId:"+s.id+"\nStudent Name:"+s.name);
System.out.println("\nParameterized Constructor values:\n");
Student s1=new Student(10,"David");
System.out.println("StudentId:"+s1.id+"\n Student Name:"+s1.name);
Student T=new Student();
T.Teacher();
T.Teacher(5,6);
}
}