import java.util.*;
class LeapYear{
public static void main(String[] arg)
{

long a;
Scanner s=new Scanner(System.in);
a=s.nextLong();
if((a % 4 == 0) || (a % 100 == 0) ||(a % 400 == 0)) 
{
      System.out.println("true");
}

else 
{
       System.out.println("false");
}           
}
}
  