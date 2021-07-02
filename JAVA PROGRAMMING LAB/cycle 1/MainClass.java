class Base 
{
int a=10;
}
class Child extends Base
{ 
int b=20;
 void sum()
{
System.out.println("sum is"+(a+b));
}
}
class MainClass
{
public static void main(String[] args)
{
Child obj= new Child();
obj.sum();
}
}
