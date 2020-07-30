
public class TelegramBill
{
    private int words;
    double bill;

    void accept (int w)
    {
        words = w;
    }
    
    void calculate ()
    {
        if (words<=15)
        bill = 5;
        else 
        bill = 5 + ((words-15)*1);
        
        System.out.println ("The number of words typed by the user are " +words);
        System.out.println ("The bill to be payed by the user is " +bill);
    }
    
    public static void main ()
    {
        TelegramBill obj = new TelegramBill ();
        obj.accept (73);
        obj.calculate ();
    }
}
