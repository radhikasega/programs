// The series is: 2! - 4! + 6! - 8! + ..... n
import java.util.Scanner;
public class Series7
{
    int n;
    void getData ()
    {
        Scanner sc = new Scanner (System.in);
        System.out.println ("Enter the value of 'n':");
        n = sc.nextInt ();
    }
    
    int fact (int m)
    {
        int prod = 1;
        for (int j = 1; j<=m; j++)
             prod = prod*j;
        return prod;
    }
    
    void calculate ()
    {
        int sum = 0;
        for (int i = 2; i<=n; i=i+2)
        {
            if (i%4 != 0)
                sum = sum + fact (i);
            else
                sum = sum - fact (i);
        }
        System.out.println ("The sum of the series is " +sum);
    }
    
    public static void main ()
    {
        Series7 obj = new Series7 ();
        obj.getData ();
        obj.calculate ();
    }
}
    
        