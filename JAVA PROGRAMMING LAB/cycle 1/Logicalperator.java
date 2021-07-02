import java.util.*;
class Logicalperator
{
public static void main(String args[])
{
Scanner sc=new Scanner(System.in);
int a,b;
a=sc.nextInt();
b=sc.nextInt();
System.out.println((a > b) && (a > b));  
    System.out.println((a > b) && (a < b));  
    System.out.println((a < b) || (a > b));  
    System.out.println((a > b) || (a < b)); 
    System.out.println((a < b) || (a < b)); 
if( a == b)
System.out.println("True");
else
System.out.println("Flase");
}
}
