public class Account
{
    double balance;
    long account_number;
    // We take a default constructor because the question has specified for an initialize methood
    public Account ()// Default constructor
    {
        balance = 0.0;
    }
    void initialize (double amt)
    {
        balance = amt;
    }
    void deposit (double amount)
    {
        balance+= amount;
    }
    void withdraw (double amount)
    {
        balance-= amount;
    }
    double getBalance ()
    {
        return balance;
    }
}
    
        