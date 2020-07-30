public class Grade
{
    String name;
    double percent;
    
    void input (String n, double p)
    {
        name = n;
        percent = p;
        System.out.println ("The name of the student is " +name);
        System.out.println ("The Percentage of the student is " +percent);
    }
    
    void calculate ()
    {
        if (percent>=90 && percent<=100)
            System.out.println ("Grade obtained is A");
        else if (percent >= 80)
            System.out.println ("Grade obtained is B");
        else if (percent >= 40)
            System.out.println ("Grade obtained is C");
        else if (percent >= 0) 
            System.out.println ("Grade obtained is D");
        else 
            System.out.println ("Invalid Percentage Value");
    }
    
    public static void main ()
    {
        Grade grades = new Grade ();
        grades.input ("Rhea Suresh", 95.4);
        grades.calculate ();
    }
}

        