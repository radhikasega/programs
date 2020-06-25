public class Time
{
    private int hr, min, sec;
    void accept (int hour, int minute, int second)
    {
        hr = hour;
        min = minute;
        sec = second;
    }
    
    void convert ()
    {
        hr= hr*60*60;
        min = min*60;
    }
    
    void showResult()
    {
        System.out.println("The time in hours is:" +hr);
        System.out.println("The time in minutes is:" +min);
        System.out.println("The time in seconds is:" +sec);
    }
    
    public static void main ()
    {
        Time obj = new Time ();
        obj.accept (3,45,27);
        obj.convert ();
        obj.showResult ();
    }
    
}

        
    