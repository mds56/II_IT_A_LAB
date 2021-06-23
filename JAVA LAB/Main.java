class Base 
{
Base(int x)
{
int a=x;M
System.out.println("value of a is"+a);
}
Base()
{
System.out.println("Base class constructor");
}
}
class Child extends Base
{ 
Child()
{
super(1000);
System.out.println("Child class constructor");
}
}
class Main
{
public static void main(String[] args)
{
Child obj= new Child();
}
}
