public class Cube 
{
    double s;
    double volume;
    
    public Cube ()
    {
        s = 5.0;
    }
    
    void accept (double side)
    {
        s = side;
    }
    
    void calculate ()
    {
        volume = s*s*s;
    }
    
    void display ()
    {
        System.out.println ("The volue of the cube is " +volume);
    }
    
    public static void main ()
    {
        Cube obj = new Cube ();
        obj.accept (7.0);
        obj.calculate ();
        obj.display ();
    }
}

        