import java.util.*;
public class TelegramBill
{
    private int words;
    double bill;

    void accept ()
    {
        Scanner sc = new Scanner (System.in); 
        int w = 0;
        System.out.println ("Enter the number of words typed: ");
        w = sc.nextInt ();
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
        obj.accept ();
        obj.calculate ();
    }
}
