import java.util.Scanner;
public class PhoneBill 
{
    double bill;
    int call;
    
    void accept ()
    {
        Scanner sc = new Scanner (System.in);
        int c = 0;
        System.out.println ("Enter the number of calls made: ");
        c = sc.nextInt ();
        call = c;
    }
    
    void calculate ()
    {
        if (call<=100)
            bill = 100;
        else if (call>100 && call<=150)
            bill = 100 + ((call-100)*2);
        else 
            bill = 100 + (50*2) + ((call-150)*2.5);
        
        System.out.println ("The Phone Bill of the user is " +bill);
    }
    
    public static void main ()
    {
        PhoneBill obj = new PhoneBill ();
        obj.accept ();
        obj.calculate ();
    }
}