//Board Paper 2008
public class employee
{
    String name;
    double tax, taxincome;
    int pan;
    
    employee () //Default constructor
    {
        name = "";
        taxincome = 00.00;
        pan = 00;
    }
    
    void input (String n, double tax_income, int pan_number)
    {
        name = n;
        taxincome = tax_income;
        pan = pan_number;
    }
    
    void calculate ()
    {
        if (taxincome<=100000)
        {
            tax = 0;
        }
        else if ((taxincome>=100001)&&(taxincome<=150000))
        {
            tax = ((taxincome-100000)*10)/100;
        }
        else if ((taxincome>=150001)&&(taxincome<=250000))
        {
            tax = 5000 + (((taxincome-150000)*20)/100);
        }
        else
        {
            tax = 25000 + (((taxincome-250000)*30)/100);
        }
    }
    
    void output ()
    {
        System.out.println ("Pan Number" + "\t" + "Name" + "\t" + "    Tax Income" + "    \t" + "Tax");
        System.out.println ( pan + "     \t" + name + "  \t" + taxincome + "      \t" + tax);
    }
    
    public static void main ()
    {
        employee obj = new employee ();
        obj.input ("Nishita",345700,4863);
        obj.calculate ();
        obj.output ();
    }
}
    