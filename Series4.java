//The series is: s = 2 + 5 + 10 + 17 + 26 + .... +n
import java.util.Scanner;
public class Series4
{
    int n;
    void getData ()
    {
        Scanner sc = new Scanner (System.in);
        System.out.println ("Enter the value of 'n': ");
        n = sc.nextInt ();
    }
    
    void computeSum ()
    {
        int sum = 0;
        for (int i = 1; sum<=n; i++)
        {
            sum = sum + (i*i) + 1;
        }
        System.out.println ("The sum of the series is " +sum);
    }
    
    public static void main ()
    {
        Series4 obj = new Series4 ();
        obj.getData ();
        obj.computeSum ();
    }
}

            