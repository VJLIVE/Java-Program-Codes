class Num{
int a,b;
public void ThisEx1(int a, int b)
{
this.a=a;
this.b=b;
int c=a+b;
int avg=c/2;

System.out.println("The sum of two numbers is: "+c);
System.out.println("The avaerage of two numbers is: "+avg);
}
public static void main(String args[])
{
int x,y;
x=Integer.parseInt(args[0]);
y=Integer.parseInt(args[1]);

Num S=new Num();
S.ThisEx1(x,y);
}
}
