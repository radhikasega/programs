//The series is: x1/1! + x2/2! + .... + xn/n!
import java.util.Scanner;
class Series3
{
    int n, x;
    void getData ()
    {
        Scanner sc = new Scanner (System.in);
        System.out.println ("Enter the value of 'n':");
        n = sc.nextInt ();
        System.out.println ("Enter the value of 'x':");
        x = sc.nextInt ();
    }
    
    int fact (int m)
    {
        int prod = 1;
        for (int i = 1; i<=m; i++)
             prod = prod*i;
        return prod;
    }
    
    void computeSum ()
    {
        double sum = 0;
        for (int i = 1; i<=n; i++)
             sum = sum + (Math.pow(x,i))/fact(i);
        System.out.println ("The sum of the series is " +sum);
    }
    
    public static void main ()
    {
        Series3 obj = new Series3 ();
        obj.getData ();
        obj.computeSum ();
    }
}
