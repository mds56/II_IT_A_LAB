class Main3
{
        public static void main(String args[])
        {
                A a = new A();
                a.innermethod();
        }
}
class OutterClass
{
        interface InnerInterface
        {
                void innermethod();
        }
}
class A implements OutterClass.InnerInterface
{
        public void innermethod()
        {
                System.out.println("InnerInterface method");
        }
}