//The sum of the series is: s = 1 - 2 + 3 - 4 + ..... n
import java.util.Scanner;
public class Series6
{
    int n;
    void getData ()
    {
        Scanner sc = new Scanner (System.in);
        System.out.println ("Enter the value of n:");
        n = sc.nextInt ();
    }
    
    void Calculate ()
    {
        int sum = 0;
        for (int i = 1; i<=n; i++)
        {
            if (i%2 != 0)
                sum = sum + i;
            else 
                sum = sum - i;
        }
        System.out.println ("The sum of the series is " +sum);
    }
    
    public static void main ()
    {
        Series6 obj = new Series6 ();
        obj.getData ();
        obj.Calculate ();
    }
}
                