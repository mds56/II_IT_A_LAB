class DemoBuffer
{
public static void main(String args[])
{
StringBuffer name1 = new StringBuffer("welcome");
StringBuffer name2 = new StringBuffer("to JAVA ");
StringBuffer name3 = new StringBuffer("Programming");
name1.append(name2);
System.out.println(name1);

char a =name1.charAt(2);
System.out.println(a);

name2.setCharAt(2,'s');
System.out.println(name2);

name2.insert(3,"go");
System.out.println(name2);

name2.delete(2,4);
System.out.println(name2);

name2.deleteCharAt(2);
System.out.println(name2);

name3.reverse();
System.out.println(name3);

name2.replace(2,4,"no");
System.out.println(name2);

int x=name3.indexOf("o");
System.out.println(x);

int y=name3.lastIndexOf("r");
System.out.println(y);

System.out.println(name2.substring(2));

System.out.println(name3.capacity());

System.out.println(name3.length());
}
}