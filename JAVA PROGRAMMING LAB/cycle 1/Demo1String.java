class Demo1String
{
public static void main(String args[])
{
String name1 ="welcome";

String name2 = "to JAVA";
name1.concat(name2);
char ch=name1.charAt(2);
int index = name1.indexOf("co");
int index1 = name1.lastIndexOf('e',2);
String name1low=name1.toLowerCase();
String name1up=name1.toUpperCase();
String[] w=name2.split("");
String replace=name2.replace('J','L');

System.out.println(name1.length());
System.out.println(name1);
System.out.println(ch);
System.out.println(name1.compareTo(name2));
System.out.println(name1.equals(name2));
System.out.println(name1.startsWith("we"));
System.out.println(name1.endsWith("we"));
System.out.println(index);
System.out.println(index1);
System.out.println(name2.substring(2));
System.out.println(name1low);
System.out.println(name1up);
System.out.println(name1.trim()+"to java");
System.out.println(w);
System.out.println(replace);
System.out.println(name1.compareToIgnoreCase(name2));
}
}