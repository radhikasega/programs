public class Account1
{
    public static void main ()
    {
        Account my_account = new Account (); //Creating an empty account
        my_account.initialize (1000);
        my_account.deposit (250.00); //Deposit money
        System.out.println("Current balance "+my_account.getBalance());//Print current balance
        my_account.withdraw (175.00); //Withdraw money
        System.out.println("Remaining balance "+my_account.getBalance());//Prints remaining balance
    }
}