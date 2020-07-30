public class BusFare
{
    double distance;
    double fare;
    void accept (double dist)
    {
        distance = dist;
    }
    
    void calculate ()
    {
        if (distance>0 && distance<=1)
            fare = 4;
        else if (distance>1 && distance<=5) 
            fare = 4 + ((distance-1)*4);
        else if (distance>5 && distance<=15)
            fare = 4 + (4*4) + ((distance-5)*6);
        else 
            fare = 4 + (4*4) + (10*6) + ((distance-15)*8);
        
        System.out.println ("The distance travelled by the passenger is " +distance);
        System.out.println ("The Bus Fare is "+fare);
    }
    
    public static void main ()
    {
        BusFare bill = new BusFare ();
        bill.accept (26.00);
        bill.calculate ();
    }
}

    