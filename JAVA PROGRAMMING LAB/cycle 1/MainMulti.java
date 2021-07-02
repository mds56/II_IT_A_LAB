class MainMulti
{
        public static void main(String args[])
        {
                Multi m = new Multi();
                m.accountnumber();
                m.getRol();
        }
}
interface Bank
{
        void accountnumber();
}
interface Loan
{
        void getRol();
}
class Multi implements Bank, Loan
{
        public void accountnumber()
        {
                System.out.println("Details of account");
        }
        public void getRol()
        {
                System.out.println("Rate of interest");
        }
}