//The series is: 1 + x + x2 + x3 + .... + xn
import java.util.*;
public class Series2
{
    int n,x;
    
    void getData()
    {
        Scanner sc = new Scanner (System.in);
        System.out.println ("Enter the value of 'n'"); 
        n = sc.nextInt ();
        System.out.println ("Enter the value of 'x'");
        x = sc.nextInt ();
    }
    
    void calculate ()
    {
        double sum = 0;
        for (int i = 0; i<=n; i++)
        {
            sum = sum + Math.pow(x,i);
        }
        System.out.println ("The sum of the series is " +sum);
    }
    
    static void main ()
    {
        Series2 obj = new Series2 ();
        obj.getData ();
        obj.calculate ();
    }
}

    
       