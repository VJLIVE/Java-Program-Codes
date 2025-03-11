class BaseClass
{
 int parentNum=10;
}
Class SubClass 1 extends BaseClass
{
 int childNum1=1;
}
Class SubClass 2 extends BaseClass
{
 int childNum2=2;
}
Class SubClass 3 extends BaseClass
{
 int childNum3=3;
}
public class Hier
{
 public static void main(String args[])
 {
  subclass1 childObj1 = new Subclass1();
  subclass1 childObj2 = new Subclass2();
  subclass1 childObj3 = new Subclass3();
  System.out.println("ParentNum*chldNum1 ="+childObj1.ParentNum*childObj1.childNum1);
  System.out.println("ParentNum*chldNum2 ="+childObj2.ParentNum*childObj2.childNum2);
  System.out.println("ParentNum*chldNum3 ="+childObj3.ParentNum*childObj3.childNum3);
 }
}