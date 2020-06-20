public class oddNumbers
{
    void calculate()
    {
        System.out.println ("The odd numbers are:");
        for (int i = 1; i<=100; i++)
        {
            if (i%2!=0)
            {
                System.out.println (i);
            }
        }
    }
    public static void main ()
    {
       oddNumbers obj = new oddNumbers ();
       obj.calculate();
    }
}

 