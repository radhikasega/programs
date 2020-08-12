// The series is: 1 + (1+2) +(1+2+3) + (1+2+3+4) + .... (1+2+3+4+...+n)
import java.util.Scanner;
public class Series5
{
    int n;
    void getData ()
    {
        Scanner sc = new Scanner (System.in);
        System.out.println ("Enter the value of n: ");
        n = sc.nextInt ();
    }
    
    int sum1 (int m)
    {
        int s =0;
        for (int j = 1; j<=m; j++) 
             s = s+j;
        return s;
    }
    
    void calculate ()
    {
        int sum = 0;
        for (int i = 1; i<=n; i++)
        {
            sum = sum + sum1 (i);
        }
        System.out.println ("The sum of the series is " +sum);
    }
    
    public static void main ()
    {
        Series5 obj = new Series5 ();
        obj.getData ();
        obj.calculate ();
    }
}

    
            