class MainExt
{
        public static void main(String args[])
        {
                A a = new A();
                a.childmethod();
                a.parentmethod();
        }
}
interface ParentInterface
{
        void parentmethod();
}
interface ChildInterface extends ParentInterface
{
        void childmethod();
}
class A implements ChildInterface
{
        public void childmethod()
        {
                System.out.println("Child Interface method");
        }
        public void parentmethod()
        {
                System.out.println("Parent Inetrface method");
        }
}