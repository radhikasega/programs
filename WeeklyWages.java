public class WeeklyWages
{
    double rate, hours, wages;
    
    void accept (double r, double hr)
    {
        rate = r;
        hours = hr;
    }
    
    void calculate ()
    {
        if ((hours>0) && (hours<=35.0))
        {
            wages = rate*hours;
            System.out.println ("The wages of the man is " +wages);
        }
        else if ((hours>35) && (hours<=60))
        {
            wages = (rate*35) + ((1.5*rate)*(hours-35));
            System.out.println ("The wages of the man is " +wages);
        }
        else
        {
            wages = (rate*35) + ((1.5*rate)*25) + ((2*rate)*(hours-60));
            System.out.println ("The wages of the man is " +wages);
        }
    }
    
    public static void main ()
    {
        WeeklyWages obj = new WeeklyWages ();
        obj.accept (500.00, 65.00);
        obj.calculate ();
    }
}

        
            