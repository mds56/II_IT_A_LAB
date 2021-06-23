class MainClass1
{
public static void main(String[] args)
{
Child obj= new Child();
obj.Display();
}
}

class Base 
{
void Base123()
{
System.out.println("Base class");
}
}
class Child extends Base
{ 
void Base123()
{
System.out.println("child class");
}
void Display()
{
Base123();
super.Base123();
}
}

