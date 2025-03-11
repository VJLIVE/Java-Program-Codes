class A
{
 double res;
 void add(double a,double b)
 {
  res=a+b;
  System.out.println("Sum= " +res);
 }
}
class B extends A
{
 double res;
 void sub(double a,double b)
 {
  res=a-b;
  System.out.println("Diffrence= " +res);
 }
}
class C extends B
{
 double res;
 void mul(double a,double b)
 {
  res=a*b;
  System.out.println("Product= " +res);
 }
}
public class Myinheritance
{
 public static void main(String args[])
 {
  C s1=new C();
  s1.add(10.0,20.0);
  s1.sub(10.0,20.0);
  s1.mul(10.0,20.0);
 }
}