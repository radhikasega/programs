class Time2
{
    int hrs, mins;
    
    void input (int h, int m)
    {
        hrs = h;
        mins = m;
    }
    
    void addTime (Time2 obj1, Time2 obj2)
    {
        int totalmins = obj1.hrs*60 + obj1.mins + obj2.hrs*60 + obj2.mins;
        hrs = totalmins/60;
        mins = totalmins%60;
    }
    
    void display ()
    {
        System.out.println ("The total time is " +hrs+ " hours " +mins+ " minutes.");
    }
    
    public static void main ()
    {
        Time2 t1 = new Time2 ();
        Time2 t2 = new Time2 ();
        Time2 t3 = new Time2 ();
        t1.input (4,28);
        t2.input (7,53);
        t3.addTime (t1,t2);
        t3.display ();
    }
}
