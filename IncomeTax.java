
public class IncomeTax
{
    String name;
    double income, tax;
    
    void accept (String n, double i)
    {
        name = n;
        income = i;
    }
    
    void calculate ()
    {
        if (income<=40000)
            tax = 0;
        else if (income>40000 && income<70000)
            tax = income*(20/100);
        else if (income>70000 && income<=100000)
            tax = income * (30/100);
        else 
            tax = income * (40/100);
    }
    
    void display ()
    {        
        System.out.println ("The name of the employee is " +name);
        System.out.println ("The income of the employee is "+income);
        System.out.println ("The tax to be payed by the employee is "+tax);
    }
    
    public static void main ()
    {
        IncomeTax obj = new IncomeTax ();
        obj.accept ("Priya Malhotra", 163860);
        obj.calculate ();
        obj.display ();
    }
}
