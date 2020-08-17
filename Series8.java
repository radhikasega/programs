// The series is: (1+2)/(1*2) + (1+2+3)/(1*2*3) + ... + (1+2+3+..+n)/(1*2*3*..n)
import java.util.Scanner;

public class Series8
{
    int n;
    void getData ()
    {
        Scanner sc = new Scanner (System.in);
        System.out.println ("Enter the value of n:");
        n = sc.nextInt ();
    }
    
    double numerator (int a)
    {
        double num = 0;
        for (int y = 1; y<=a; y++)
             num = num+1;
        return num;
    }
    
    double denominator (int b)
    {
        double den = 1;
        for (int z = 1; z<=b; z++)
             den = den * z;
        return den;
    }
    
    void calculate ()
    {
        double sum = 0;
        for (int i = 1; i<=n; i++)
             sum = sum + (numerator (i+1)) / (denominator (i+1));
        System.out.println ("The sum of the series is " +sum);
    }
    
    public static void main ()
    {
        Series8 obj = new Series8 ();
        obj.getData ();
        obj.calculate ();
    }
}

        