import java.util.Scanner;
class Main
{
public static void main(String[] args)
{
Scanner myObj=new Scanner(System.in);
System.out.println("Enter username");
String userName = myObj.nextLine();
System.out.println(userName);
System.out.println("Enter Lastname");
String lastname=myObj.nextLine();
System.out.println(lastname);
System.out.println("Enter name,age and salary:");
String name = myObj.nextLine();
int age = myObj.nextInt();
double salary = myObj.nextDouble();
System.out.println("Name:"+name);
System.out.println("Age:"+age);
System.out.println("Salary:"+salary);
}
}
