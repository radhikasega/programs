//The series is: s = 1+2+3.....+n
import java.util.Scanner;
public class Series1
{
    int n;
    
    void GetData ()
    {
        Scanner sc = new Scanner (System.in);
        System.out.println ("Enter the number of terms in the series: ");
        n = sc.nextInt ();
    }
    
    void compute ()
    {
        int sum = 0;
        
        for (int i = 1; i<=n; i++)
        {
             sum = sum + i;
        }
        
        System.out.println ("The sum of the series is " +sum);
    }

    public static void main ()
    {
        Series1 obj = new Series1 ();
        obj.GetData ();
        obj.compute ();
    }
} 