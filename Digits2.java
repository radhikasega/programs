//Program to calculate the sum of digits in a number
import java.util.Scanner;
public class Digits2
{
    int num;
    void getNumber ()
    {
        Scanner sc = new Scanner (System.in);
        System.out.println ("Enter the number: ");
        num = sc.nextInt ();
    }
    
    void Calculate ()
    {
        int d;
        int n = num;
        int sum = 0;
        while (n!=0)
        {
            d = n%10;
            n = n/10;
            sum = sum + d;
        }
        System.out.println ("the sum of the digits is " +sum);
    }
    
    public static void main ()
    {
        Digits2 obj = new Digits2 ();
        obj.getNumber ();
        obj.Calculate ();
    }
}

        